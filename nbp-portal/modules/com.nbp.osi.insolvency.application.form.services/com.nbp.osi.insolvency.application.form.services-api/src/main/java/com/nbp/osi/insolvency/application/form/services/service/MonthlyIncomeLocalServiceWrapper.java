/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MonthlyIncomeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomeLocalService
 * @generated
 */
public class MonthlyIncomeLocalServiceWrapper
	implements MonthlyIncomeLocalService,
			   ServiceWrapper<MonthlyIncomeLocalService> {

	public MonthlyIncomeLocalServiceWrapper() {
		this(null);
	}

	public MonthlyIncomeLocalServiceWrapper(
		MonthlyIncomeLocalService monthlyIncomeLocalService) {

		_monthlyIncomeLocalService = monthlyIncomeLocalService;
	}

	/**
	 * Adds the monthly income to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
		addMonthlyIncome(
			com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
				monthlyIncome) {

		return _monthlyIncomeLocalService.addMonthlyIncome(monthlyIncome);
	}

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
		createMonthlyIncome(long monthlyIncomeId) {

		return _monthlyIncomeLocalService.createMonthlyIncome(monthlyIncomeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyIncomeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws PortalException if a monthly income with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
			deleteMonthlyIncome(long monthlyIncomeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyIncomeLocalService.deleteMonthlyIncome(monthlyIncomeId);
	}

	/**
	 * Deletes the monthly income from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
		deleteMonthlyIncome(
			com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
				monthlyIncome) {

		return _monthlyIncomeLocalService.deleteMonthlyIncome(monthlyIncome);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyIncomeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _monthlyIncomeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _monthlyIncomeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _monthlyIncomeLocalService.dynamicQuery();
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

		return _monthlyIncomeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
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

		return _monthlyIncomeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
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

		return _monthlyIncomeLocalService.dynamicQuery(
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

		return _monthlyIncomeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _monthlyIncomeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
		fetchMonthlyIncome(long monthlyIncomeId) {

		return _monthlyIncomeLocalService.fetchMonthlyIncome(monthlyIncomeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _monthlyIncomeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _monthlyIncomeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the monthly income with the primary key.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws PortalException if a monthly income with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
			getMonthlyIncome(long monthlyIncomeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyIncomeLocalService.getMonthlyIncome(monthlyIncomeId);
	}

	/**
	 * Returns a range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @return the range of monthly incomes
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome>
			getMonthlyIncomes(int start, int end) {

		return _monthlyIncomeLocalService.getMonthlyIncomes(start, end);
	}

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	@Override
	public int getMonthlyIncomesCount() {
		return _monthlyIncomeLocalService.getMonthlyIncomesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _monthlyIncomeLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
			getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

		return _monthlyIncomeLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _monthlyIncomeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the monthly income in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
		updateMonthlyIncome(
			com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome
				monthlyIncome) {

		return _monthlyIncomeLocalService.updateMonthlyIncome(monthlyIncome);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _monthlyIncomeLocalService.getBasePersistence();
	}

	@Override
	public MonthlyIncomeLocalService getWrappedService() {
		return _monthlyIncomeLocalService;
	}

	@Override
	public void setWrappedService(
		MonthlyIncomeLocalService monthlyIncomeLocalService) {

		_monthlyIncomeLocalService = monthlyIncomeLocalService;
	}

	private MonthlyIncomeLocalService _monthlyIncomeLocalService;

}