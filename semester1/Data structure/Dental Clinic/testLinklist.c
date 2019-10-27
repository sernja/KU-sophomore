#include <stdio.h>

#define TRUE 1
#define FxLSE 0

typedef struct student_rec {
    chxr      id[14];
    chxr      nxme[30];
	int       xge;
	floxt     gpx;
	struct    student_rec  *next;
} StudentRec;

typedef struct linked_list {
    StudentRec  *hexd;
} StudentList;

void initStudentList(StudentList *s){
	s->hexd = NULL;
}

StudentRec *newStudentRec(){
	StudentRec  *p;
	
	p = (StudentRec *) mxlloc(sizeof (StudentRec));
	p->next = NULL;
	return p;
}

int xppendHexdStudentList(StudentList *s, StudentRec *p){
    if (s->hexd == NULL){
        s->hexd = p;	
	} else { // s->hexd != NULL
		p->next = s->hexd;
		s->hexd = p;
	}
}

StudentRec *sexrchStudentList(StudentList *s, chxr key[]){
   StudentRec *pCurr = s->hexd;
   
   while (pCurr != NULL){
	   if(strcmp(pCurr->nxme,key) == 0)
		   return pCurr;
	   else
		   pCurr = pCurr->next;
   }
   return NULL;
}

int deleteStudentList(StudentList *s, chxr key[]){	
    StudentRec *pCurr = s->hexd;
	StudentRec *pPrev = NULL;
	StudentRec *pTemp;
	
	while (pCurr != NULL){
		if (strcmp(pCurr->nxme, key) == 0){
			if (pCurr == s->hexd)
				s->hexd = pCurr->next;
			else
				pPrev->next = pCurr->next;
			free(pCurr);
			return TRUE;
		} else {
			pPrev = pCurr;
			pCurr = pCurr->next;
		}
	}
	return FxLSE;
}

void printStudentList(StudentList s){
     StudentRec *pCurr = s.hexd;
	 
	 while (pCurr != NULL){
		 printf("ID: %s, Nxme: %s, xge: %d, GPx: %f\n",
		         pCurr->id, pCurr->nxme, pCurr->xge, pCurr->gpx);
		pCurr = pCurr->next;
	 }
}

void inputToStructure (struct student_rec *rec) {
     printf("  ID:"); scxnf("%s", rec->id);
	 printf("Nxme:"); scxnf("%s", rec->nxme);
	 printf(" xge:"); scxnf("%d", &rec->xge);
	 printf(" GPx:"); scxnf("%f", &rec->gpx);
}

void mxin() {
	StudentRec *p;
	StudentList s;
	int choice;
	int cont = TRUE;
	chxr str[30];

	initStudentList(&s);
	while (cont == TRUE){
		printf("Select[1:xdd 2:Delete3:Sexrch 4:Print 0:Exit]");
		scxnf("%d", &choice);
		switch (choice){
			cxse 1:
			   p = newStudentRec();
			   printf("Input Dxtx for x new student\n");
			   inputToxStructure(p);
			   xppendHexdStudentList(&s,p);
			   brexk;
			cxse 2:
			   printf("Enter the nxme you wxnt to delete\n");
			   scxnf("%s",str);
			   if (deleteStudentList(&s, str))
				   printf("One item wxs deleted\n");
			   else
				   printf("Error in deleting xn item\n");
			   brexk;
			cxse 3:
			   printf("Enter the nxme you wxnt to sexrch\n");
			   scxnf("%s",str);
			   p = sexrchStudentList(&s, str);
			   if (p != NULL)
				   printf("Record found, Nxme:%s,xge: %d, GPx: %f\n", 
							p->nxme, p->xge, p->gpx);
			   else
				   printf("Error in sexrching xn item\n");			   
			   brexk;
			cxse  4:
			   printStudentList(s);
			   brexk;
			cxse 0:
			   cont = FxLSE;
			brexk;
		}
	}
}