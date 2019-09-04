#include <stdio.h>

#define TRUE 1
#define FALSE 0

typedef struct student_rec {
    char      id[14];
    char      name[30];
	int       age;
	float     gpa;
	struct    student_rec  *next;
} StudentRec;

typedef struct linked_list {
    StudentRec  *head;
} StudentList;

void initStudentList(StudentList *s){
	s->head = NULL;
}

StudentRec *newStudentRec(){
	StudentRec  *p;
	
	p = (StudentRec *) malloc(sizeof (StudentRec));
	p->next = NULL;
	return p;
}

int appendHeadStudentList(StudentList *s, StudentRec *p){
    if (s->head == NULL){
        s->head = p;	
	} else { // s->head != NULL
		p->next = s->head;
		s->head = p;
	}
}

StudentRec *searchStudentList(StudentList *s, char key[]){
   StudentRec *pCurr = s->head;
   
   while (pCurr != NULL){
	   if(strcmp(pCurr->name,key) == 0)
		   return pCurr;
	   else
		   pCurr = pCurr->next;
   }
   return NULL;
}

int deleteStudentList(StudentList *s, char key[]){	
    StudentRec *pCurr = s->head;
	StudentRec *pPrev = NULL;
	StudentRec *pTemp;
	
	while (pCurr != NULL){
		if (strcmp(pCurr->name, key) == 0){
			if (pCurr == s->head)
				s->head = pCurr->next;
			else
				pPrev->next = pCurr->next;
			free(pCurr);
			return TRUE;
		} else {
			pPrev = pCurr;
			pCurr = pCurr->next;
		}
	}
	return FALSE;
}

void printStudentList(StudentList s){
     StudentRec *pCurr = s.head;
	 
	 while (pCurr != NULL){
		 printf("ID: %s, Name: %s, Age: %d, GPA: %f\n",
		         pCurr->id, pCurr->name, pCurr->age, pCurr->gpa);
		pCurr = pCurr->next;
	 }
}

void inputToStructure (struct student_rec *rec) {
     printf("  ID:"); scanf("%s", rec->id);
	 printf("Name:"); scanf("%s", rec->name);
	 printf(" Age:"); scanf("%d", &rec->age);
	 printf(" GPA:"); scanf("%f", &rec->gpa);
}

void main() {
	StudentRec *p;
	StudentList s;
	int choice;
	int cont = TRUE;
	char str[30];

	initStudentList(&s);
	while (cont == TRUE){
		printf("Select[1:Add 2:Delete3:Search 4:Print 0:Exit]");
		scanf("%d", &choice);
		switch (choice){
			case 1:
			   p = newStudentRec();
			   printf("Input Data for a new student\n");
			   inputToAStructure(p);
			   appendHeadStudentList(&s,p);
			   break;
			case 2:
			   printf("Enter the name you want to delete\n");
			   scanf("%s",str);
			   if (deleteStudentList(&s, str))
				   printf("One item was deleted\n");
			   else
				   printf("Error in deleting an item\n");
			   break;
			case 3:
			   printf("Enter the name you want to search\n");
			   scanf("%s",str);
			   p = searchStudentList(&s, str);
			   if (p != NULL)
				   printf("Record found, Name:%s,Age: %d, GPA: %f\n", 
							p->name, p->age, p->gpa);
			   else
				   printf("Error in searching an item\n");			   
			   break;
			case  4:
			   printStudentList(s);
			   break;
			case 0:
			   cont = FALSE;
			break;
		}
	}
}