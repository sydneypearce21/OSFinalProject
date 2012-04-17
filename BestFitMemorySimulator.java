

public class BestFitMemorySimulator extends MemorySimulatorBase {
	public BestFitMemorySimulator(String filename) {
		super(filename);
	}

	public int getNextSlot(int slotSize) {
		
		/* This one is Noah's problem */
		
		int best_size 	= -1;
		int best_start 	= -1;	
		int block_size 	= 0;

		for (int i = 0; i < main_memory.length-slotSize; i++) {
			if(main_memory[i] == FREE_MEMORY)
				block_size++;
			else
			{
				if(block_size >= slotSize && block_size - slotSize < best_size - slotSize || best_size == -1)
				{
					best_start 	= i - block_size;
					best_size 	= block_size;
				}
				block_size = 0;
			}
		}

		System.out.println("Best size is: " + best_size);
		return -1;
	}
}