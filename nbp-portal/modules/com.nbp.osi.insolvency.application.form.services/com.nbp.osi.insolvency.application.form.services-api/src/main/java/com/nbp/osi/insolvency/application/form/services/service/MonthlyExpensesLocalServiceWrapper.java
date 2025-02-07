/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MonthlyExpensesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesLocalService
 * @generated
 */
public class MonthlyExpensesLocalServiceWrapper
	implements MonthlyExpensesLocalService,
			   ServiceWrapper<MonthlyExpensesLocalService> {

	public MonthlyExpensesLocalServiceWrapper() {
		this(null);
	}

	public MonthlyExpensesLocalServiceWrapper(
		MonthlyExpensesLocalService monthlyExpensesLocalService) {

		_monthlyExpensesLocalService = monthlyExpensesLocalService;
	}

	/**
	 * Adds the monthly expenses to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyExpenses the monthly expenses
	 * @return the monthly expenses that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
			addMonthlyExpenses(
				com.nbp.osi.insolvency.application.form.services.model.
					MonthlyExpenses monthlyExpenses) {

		return _monthlyExpensesLocalService.addMonthlyExpenses(monthlyExpenses);
	}

	/**
	 * Creates a new monthly expenses with the primary key. Does not add the monthly expenses to the database.
	 *
	 * @param monthlyExpensesId the primary key for the new monthly expenses
	 * @return the new monthly expenses
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
			createMonthlyExpenses(long monthlyExpensesId) {

		return _monthlyExpensesLocalService.createMonthlyExpenses(
			monthlyExpensesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyExpensesLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_monthlyExpensesLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the monthly expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses that was removed
	 * @throws PortalException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
				deleteMonthlyExpenses(long monthlyExpensesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyExpensesLocalService.deleteMonthlyExpenses(
			monthlyExpensesId);
	}

	/**
	 * Deletes the monthly expenses from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyExpenses the monthly expenses
	 * @return the monthly expenses that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
			deleteMonthlyExpenses(
				com.nbp.osi.insolvency.application.form.services.model.
					MonthlyExpenses monthlyExpenses) {

		return _monthlyExpensesLocalService.deleteMonthlyExpenses(
			monthlyExpenses);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyExpensesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _monthlyExpensesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _monthlyExpensesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _monthlyExpensesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _monthlyExpensesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _monthlyExpensesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _monthlyExpensesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _monthlyExpensesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _monthlyExpensesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
			fetchMonthlyExpenses(long monthlyExpensesId) {

		return _monthlyExpensesLocalService.fetchMonthlyExpenses(
			monthlyExpensesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _monthlyExpensesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _monthlyExpensesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the monthly expenses with the primary key.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws PortalException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
				getMonthlyExpenses(long monthlyExpensesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyExpensesLocalService.getMonthlyExpenses(
			monthlyExpensesId);
	}

	/**
	 * Returns a range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @return the range of monthly expenseses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses>
			getMonthlyExpenseses(int start, int end) {

		return _monthlyExpensesLocalService.getMonthlyExpenseses(start, end);
	}

	/**
	 * Returns the number of monthly expenseses.
	 *
	 * @return the number of monthly expenseses
	 */
	@Override
	public int getMonthlyExpensesesCount() {
		return _monthlyExpensesLocalService.getMonthlyExpensesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _monthlyExpensesLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses>
				getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchMonthlyExpensesException {

		return _monthlyExpensesLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyExpensesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the monthly expenses in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyExpensesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyExpenses the monthly expenses
	 * @return the monthly expenses that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses
			updateMonthlyExpenses(
				com.nbp.osi.insolvency.application.form.services.model.
					MonthlyExpenses monthlyExpenses) {

		return _monthlyExpensesLocalService.updateMonthlyExpenses(
			monthlyExpenses);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _monthlyExpensesLocalService.getBasePersistence();
	}

	@Override
	public MonthlyExpensesLocalService getWrappedService() {
		return _monthlyExpensesLocalService;
	}

	@Override
	public void setWrappedService(
		MonthlyExpensesLocalService monthlyExpensesLocalService) {

		_monthlyExpensesLocalService = monthlyExpensesLocalService;
	}

	private MonthlyExpensesLocalService _monthlyExpensesLocalService;

}