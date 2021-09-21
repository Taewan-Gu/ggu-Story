import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/projects',
    name: 'Projects',
    component: () => import('../views/Projects.vue')
  },
  {
    path: '/projects/coderun',
    name: 'Coderun',
    component: () => import('../views/projects/Coderun.vue')
  },
  {
    path: '/projects/flanet',
    name: 'Flanet',
    component: () => import('../views/projects/Flanet.vue')
  },
  {
    path: '/projects/nuvo',
    name: 'Nuvo',
    component: () => import('../views/projects/Nuvo.vue')
  },
  {
    path: '/projects/kgbros',
    name: 'Kgbros',
    component: () => import('../views/projects/Kgbros.vue')
  },
  {
    path: '/words',
    name: 'Words',
    component: () => import('../views/Words.vue')
  },
  {
    path: '/planner',
    name: 'Planner',
    component: () => import('../views/Planner.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
