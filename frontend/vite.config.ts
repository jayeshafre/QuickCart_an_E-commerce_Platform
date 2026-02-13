import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 3000,  // Frontend runs on port 3000
    proxy: {
      // Proxy API requests to backend
      // When frontend calls /api/*, Vite forwards to localhost:8080
      '/api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
      }
    }
  }
})