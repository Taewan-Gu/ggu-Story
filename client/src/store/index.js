import { createStore } from 'vuex'

export default createStore({
  state: {
    periods: [],
    todo: [],
  },
  mutations: {
    STORE_PERIODS: function (state, periodItems) {
      state.periods = periodItems
    },
    STORE_TODO: function (state, todoItem) {
      state.todo = todoItem
    }
  },
  actions: {
    storePeriods: function (context, periodItems) {
      context.commit('STORE_PERIODS', periodItems)
    },
    storeTodo: function (context, todoItem) {
      context.commit('STORE_TODO', todoItem)
    },
  }
})
