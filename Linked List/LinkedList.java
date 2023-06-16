public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item)
    {
        Node nn = new Node(item);
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else
        {
            nn.next = this.head;
            this.head=nn;
            this.size++;
        }
    }
    public void addLast(int item)
    {
        Node nn = new Node(item);
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else
        {
            this.tail.next=nn;
            this.tail=nn;
            this.size++;
        }
    }
    public void addAtIndex(int item,int k) throws Exception
    {
        if(k<0 || k>=this.size)
        {
            throw new Exception("Empty LinkedList");
        }
        if(k==0)
        {
            addFirst(item);
        }
        else if(k==this.size-1)
        {
            addLast(item);
        }
        else
        {
            Node nn = new Node(item);
            Node k_1th = GetNode(k-1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            this.size++;
        }

    }

    public int getFirst() throws Exception
    {
        if(this.head==null)
        {
            throw new Exception("No Node",null);
        }
        return this.head.data;
    }

    public int getLast() throws Exception
    {
        if(this.head==null)
        {
            throw new Exception("No Node",null);
        }
        return this.tail.data;
    }

    private Node GetNode(int k) throws Exception
    {
        if(k<0 || k>=size)
        {
            throw new Exception("Index out of bound",null);
        }
        Node temp = this.head;
        for(int i=1;i<=k;i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public int getAtIndex(int k) throws Exception
    {
        return GetNode(k).data;
    }

    public int removeFirst()
    {
        Node temp = this.head;
        head = head.next;
        temp.next = null;
        this.size--;
        return temp.data;
    }

    public int removeLast() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Empty LinkedList", null);
        }
        if(this.size==1)
        {
            removeFirst();
        }
        int rv= this.tail.data;
        this.tail = GetNode(size-2);
        this.tail.next=null;
        this.size--;
        return rv;
    }

    public int removeAtIndex(int k) throws Exception
    {
        if(k<0 || k>=this.size)
        {
            throw new Exception("Empty LinkedList");
        }
        if(k==0)
        {
            return removeFirst();
        }
        else if(k==this.size-1)
        {
            return removeLast();
        }
        else
        {
            Node k_th = GetNode(k);
            Node k_1th = GetNode(k-1);
            k_1th.next = k_th.next;
            k_1th.next=null;
            this.size--;
            return k_th.data;
        }
    }

    public void Display()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
