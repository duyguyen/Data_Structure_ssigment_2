package Assignment_1;


interface Block
{
	public void value();
}

class BlockLab1
{
	public void processBlock(Block aBlock)
	{
		aBlock.value();
	}

	public static Block sampleBlock1()
	{
		return new Block()
		{
			public void value()
			{
				println("Hello There, I'm sampleBlock1");
			};
		};
	}

	public static Block sampleBlock2()
	{
		return new Block()
		{
			public void value()
			{
				println("I'm actually sampleBlock2, how are you?");
			};
		};
	}

	public static void println(Object o) { System.out.println(o.toString()); }

	public static void main(String[] args)
	{
		BlockLab1 example = new BlockLab1();
		example.processBlock(sampleBlock1());
		example.processBlock(sampleBlock2());
	}


}