Public Static Void randomizeUntilNum(int num, int iters)
  {
  for (int x = 0; x < iters; x++)
    {
      int randNum = (int) math.Random()*10;
      while (randNum != num)
        {
          System.out.print(randNum);
          randNum = (int) math.Random()*10;
        }
      System.out.print(randNum);
      System.out.println("");
    }
}
