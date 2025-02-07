/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiTotalMonthlyExpense. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiTotalMonthlyExpenseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpenseLocalService
 * @generated
 */
public class OsiTotalMonthlyExpenseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiTotalMonthlyExpenseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static OsiTotalMonthlyExpense addOsiTotalMonthlyExpense(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return getService().addOsiTotalMonthlyExpense(osiTotalMonthlyExpense);
	}

	/**
	 * Creates a new osi total monthly expense with the primary key. Does not add the osi total monthly expense to the database.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key for the new osi total monthly expense
	 * @return the new osi total monthly expense
	 */
	public static OsiTotalMonthlyExpense createOsiTotalMonthlyExpense(
		long osiTotalMonthlyExpenseId) {

		return getService().createOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static OsiTotalMonthlyExpense deleteOsiTotalMonthlyExpense(
			long osiTotalMonthlyExpenseId)
		throws PortalException {

		return getService().deleteOsiTotalMonthlyExpense(
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
	public static OsiTotalMonthlyExpense deleteOsiTotalMonthlyExpense(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return getService().deleteOsiTotalMonthlyExpense(
			osiTotalMonthlyExpense);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static OsiTotalMonthlyExpense fetchOsiTotalMonthlyExpense(
		long osiTotalMonthlyExpenseId) {

		return getService().fetchOsiTotalMonthlyExpense(
			osiTotalMonthlyExpenseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OsiTotalMonthlyExpense getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiTotalMonthlyExpenseException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi total monthly expense with the primary key.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws PortalException if a osi total monthly expense with the primary key could not be found
	 */
	public static OsiTotalMonthlyExpense getOsiTotalMonthlyExpense(
			long osiTotalMonthlyExpenseId)
		throws PortalException {

		return getService().getOsiTotalMonthlyExpense(osiTotalMonthlyExpenseId);
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
	public static List<OsiTotalMonthlyExpense> getOsiTotalMonthlyExpenses(
		int start, int end) {

		return getService().getOsiTotalMonthlyExpenses(start, end);
	}

	/**
	 * Returns the number of osi total monthly expenses.
	 *
	 * @return the number of osi total monthly expenses
	 */
	public static int getOsiTotalMonthlyExpensesCount() {
		return getService().getOsiTotalMonthlyExpensesCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static OsiTotalMonthlyExpense updateOsiTotalMonthlyExpense(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return getService().updateOsiTotalMonthlyExpense(
			osiTotalMonthlyExpense);
	}

	public static OsiTotalMonthlyExpenseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiTotalMonthlyExpenseLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiTotalMonthlyExpenseLocalServiceUtil.class,
			OsiTotalMonthlyExpenseLocalService.class);

}