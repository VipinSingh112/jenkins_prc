/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiTotalMonthlyExpenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpenseLocalService
 * @generated
 */
public class OsiTotalMonthlyExpenseLocalServiceWrapper
	implements OsiTotalMonthlyExpenseLocalService,
			   ServiceWrapper<OsiTotalMonthlyExpenseLocalService> {

	public OsiTotalMonthlyExpenseLocalServiceWrapper() {
		this(null);
	}

	public OsiTotalMonthlyExpenseLocalServiceWrapper(
		OsiTotalMonthlyExpenseLocalService osiTotalMonthlyExpenseLocalService) {

		_osiTotalMonthlyExpenseLocalService =
			osiTotalMonthlyExpenseLocalService;
	}

	/**
	 * Adds the osi total monthly expense to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiTotalMonthlyExpenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 * @return the osi total monthly expense that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense addOsiTotalMonthlyExpense(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return _osiTotalMonthlyExpenseLocalService.addOsiTotalMonthlyExpense(
			osiTotalMonthlyExpense);
	}

	/**
	 * Creates a new osi total monthly expense with the primary key. Does not add the osi total monthly expense to the database.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key for the new osi total monthly expense
	 * @return the new osi total monthly expense
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense createOsiTotalMonthlyExpense(
			long osiTotalMonthlyExpenseId) {

		return _osiTotalMonthlyExpenseLocalService.createOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiTotalMonthlyExpenseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi total monthly expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiTotalMonthlyExpenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 * @throws PortalException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense deleteOsiTotalMonthlyExpense(
				long osiTotalMonthlyExpenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiTotalMonthlyExpenseLocalService.deleteOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	/**
	 * Deletes the osi total monthly expense from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiTotalMonthlyExpenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense deleteOsiTotalMonthlyExpense(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return _osiTotalMonthlyExpenseLocalService.deleteOsiTotalMonthlyExpense(
			osiTotalMonthlyExpense);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiTotalMonthlyExpenseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiTotalMonthlyExpenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiTotalMonthlyExpenseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiTotalMonthlyExpenseLocalService.dynamicQuery();
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

		return _osiTotalMonthlyExpenseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiTotalMonthlyExpenseModelImpl</code>.
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

		return _osiTotalMonthlyExpenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiTotalMonthlyExpenseModelImpl</code>.
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

		return _osiTotalMonthlyExpenseLocalService.dynamicQuery(
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

		return _osiTotalMonthlyExpenseLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _osiTotalMonthlyExpenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense fetchOsiTotalMonthlyExpense(
			long osiTotalMonthlyExpenseId) {

		return _osiTotalMonthlyExpenseLocalService.fetchOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiTotalMonthlyExpenseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiTotalMonthlyExpenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiTotalMonthlyExpenseLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiTotalMonthlyExpenseException {

		return _osiTotalMonthlyExpenseLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi total monthly expense with the primary key.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws PortalException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense getOsiTotalMonthlyExpense(
				long osiTotalMonthlyExpenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiTotalMonthlyExpenseLocalService.getOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	/**
	 * Returns a range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @return the range of osi total monthly expenses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiTotalMonthlyExpense> getOsiTotalMonthlyExpenses(
				int start, int end) {

		return _osiTotalMonthlyExpenseLocalService.getOsiTotalMonthlyExpenses(
			start, end);
	}

	/**
	 * Returns the number of osi total monthly expenses.
	 *
	 * @return the number of osi total monthly expenses
	 */
	@Override
	public int getOsiTotalMonthlyExpensesCount() {
		return _osiTotalMonthlyExpenseLocalService.
			getOsiTotalMonthlyExpensesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiTotalMonthlyExpenseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi total monthly expense in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiTotalMonthlyExpenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 * @return the osi total monthly expense that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiTotalMonthlyExpense updateOsiTotalMonthlyExpense(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return _osiTotalMonthlyExpenseLocalService.updateOsiTotalMonthlyExpense(
			osiTotalMonthlyExpense);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiTotalMonthlyExpenseLocalService.getBasePersistence();
	}

	@Override
	public OsiTotalMonthlyExpenseLocalService getWrappedService() {
		return _osiTotalMonthlyExpenseLocalService;
	}

	@Override
	public void setWrappedService(
		OsiTotalMonthlyExpenseLocalService osiTotalMonthlyExpenseLocalService) {

		_osiTotalMonthlyExpenseLocalService =
			osiTotalMonthlyExpenseLocalService;
	}

	private OsiTotalMonthlyExpenseLocalService
		_osiTotalMonthlyExpenseLocalService;

}