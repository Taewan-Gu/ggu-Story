import { createStore } from 'vuex'

export default createStore({
  state: {
    periods: [],
    todo: [],
    planId: 0,
  },
  mutations: {
    STORE_PERIODS: function (state, periodItems) {
      state.periods = periodItems
    },
    STORE_TODO: function (state, todoItem) {
      state.todo = todoItem
    },
    STORE_PLAN_ID: function (state, planId) {
      state.planId = planId
    }
  },
  actions: {
    storePeriods: function (context, periodItems) {
      context.commit('STORE_PERIODS', periodItems)
    },
    storeTodo: function (context, todoItem) {
      context.commit('STORE_TODO', todoItem)
    },
    storePlanId: function (context, planId) {
      context.commit('STORE_PLAN_ID', planId)
    }
  }
})
