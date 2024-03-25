import heapq

def furthestBuilding(heights, bricks, ladders):
    used_bricks = []
    
    for i in range(len(heights) - 1):
        diff = heights[i + 1] - heights[i]
        if diff > 0:
            if ladders > 0:
                heapq.heappush(used_bricks, diff)
                ladders -= 1
            elif used_bricks and diff > used_bricks[0]:
                bricks -= heapq.heappop(used_bricks)
                heapq.heappush(used_bricks, diff)
            else:
                bricks -= diff
            if bricks < 0:
                return i
    print(heapq)
    return len(heights) - 1

heights = [4,12,2,7,3,18,20,3,19]
bricks = 10
ladders = 2
print(furthestBuilding(heights, bricks, ladders)) 