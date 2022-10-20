public class ComputeAdd extends Add implements Addtwo
    {
        public ComputeAdd(int num1, int num2)
        {
            super(num1,num2);
            computeadd();
        }
        
        @Override
        public int computeadd()
        {
            return getnum1()+getnum2();
        }
    }
