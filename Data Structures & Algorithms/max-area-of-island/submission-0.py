class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0
        
        rows, cols = len(grid), len(grid[0])
        maxAreaOfIsland = 0
        visited = set()

        def bfs(r, c):
            q = collections.deque()
            q.append((r, c))
            visited.add((r, c))
            
            area = 0

            while q:
                r, c = q.popleft()
                area += 1

                directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]

                for dr, dc in directions:
                    nr, nc = r + dr, c + dc

                    if (0 <= nr < rows and 
                        0 <= nc < cols and
                        grid[nr][nc] == 1 and
                        (nr, nc) not in visited):

                        q.append((nr, nc))
                        visited.add((nr, nc))

            return area

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1 and (r, c) not in visited:
                    area = bfs(r, c)
                    maxAreaOfIsland = max(maxAreaOfIsland, area)
                
        return maxAreaOfIsland