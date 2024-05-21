


	#include<stdio.h>
    #include<stdlib.h>	
	struct node
	{
		int info;
		struct node *next;
		};
		
		struct node *fresh,*start,*prev,*ptr;
		int f=0;
		void create_node()
		{
			int n;
			
								
				fresh = (struct node*) malloc(sizeof(struct node));
				if(fresh == NULL)
				  {
				       printf("!!!! Memory not available !!!!!");
				       exit(0);				
				  }
					else
				{		
                    printf("\n Enter a value to the node");
					scanf("%d",&n);
						fresh->info = n;			
					if(f==0)
					{	start = fresh;
						fresh->next = NULL;
						prev = fresh;
                        f++;
					}
					else
						{	
						prev->next = fresh;
						fresh->next = NULL;
                        prev=fresh;
						}
					}
				
				}
				void display_node()
			{
				ptr = start;
				printf("The linked list values are:");
				while(ptr!= NULL)
					{
						printf("\t %d",ptr->info);
						ptr = ptr->next;
						}
				}
	
				void add_node_begg()
				{
					struct node *pp;
					pp = (struct node*) malloc(sizeof(struct node));
					if(pp == NULL)
					{	
						printf("!!!!! SORRY NO MEMORY SPACE AVAILABLE !!!!!");
						exit(0);
					}	
						int a;
						printf("\n Enter a new value to the node:");
						scanf("%d",&a);	pp->info = a;
						pp->next = start;
						start = pp;
								}	

	
					void add_node_end()
				{
					struct node *pp;
					pp = (struct node*) malloc(sizeof(struct node));
					if(pp == NULL)
					{	
						printf("!!!!! SORRY NO MEMORY SPACE AVAILABLE !!!!!");
						exit(0);
						}	
							ptr = start;
							while(ptr->next != NULL)
								ptr = ptr->next;
						int a;
						printf("\n Enter a new value to the node:");
						scanf("%d",&a);	pp->info = a;
						pp->next = NULL;
						ptr = pp;
								}		
								
						
		
			int main()
			{
			int ch;
               do
				{
				printf("\n Press 1 to enter value to the node \n Press 2 to display node \n Press 3 to add a node in the beginning \n Press 4 to add a node in the end \n Press 5 to stop");
				
					scanf("%d",&ch);
						if(ch == 1)										
						create_node();
					else if(ch == 2)
						display_node();
					else if(ch == 3)
						add_node_begg();	
					else if(ch == 4)
						add_node_end();
					else 
				break;			
					}while(1);
	}			



