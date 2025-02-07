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

import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MonthlyExpenses. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyExpensesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesLocalService
 * @generated
 */
public class MonthlyExpensesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyExpensesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MonthlyExpenses addMonthlyExpenses(
		MonthlyExpenses monthlyExpenses) {

		return getService().addMonthlyExpenses(monthlyExpenses);
	}

	/**
	 * Creates a new monthly expenses with the primary key. Does not add the monthly expenses to the database.
	 *
	 * @param monthlyExpensesId the primary key for the new monthly expenses
	 * @return the new monthly expenses
	 */
	public static MonthlyExpenses createMonthlyExpenses(
		long monthlyExpensesId) {

		return getService().createMonthlyExpenses(monthlyExpensesId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteBY_Id(long applicationId) {
		getService().deleteBY_Id(applicationId);
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
	public static MonthlyExpenses deleteMonthlyExpenses(long monthlyExpensesId)
		throws PortalException {

		return getService().deleteMonthlyExpenses(monthlyExpensesId);
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
	public static MonthlyExpenses deleteMonthlyExpenses(
		MonthlyExpenses monthlyExpenses) {

		return getService().deleteMonthlyExpenses(monthlyExpenses);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl</code>.
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

	public static MonthlyExpenses fetchMonthlyExpenses(long monthlyExpensesId) {
		return getService().fetchMonthlyExpenses(monthlyExpensesId);
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
	 * Returns the monthly expenses with the primary key.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws PortalException if a monthly expenses with the primary key could not be found
	 */
	public static MonthlyExpenses getMonthlyExpenses(long monthlyExpensesId)
		throws PortalException {

		return getService().getMonthlyExpenses(monthlyExpensesId);
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
	public static List<MonthlyExpenses> getMonthlyExpenseses(
		int start, int end) {

		return getService().getMonthlyExpenseses(start, end);
	}

	/**
	 * Returns the number of monthly expenseses.
	 *
	 * @return the number of monthly expenseses
	 */
	public static int getMonthlyExpensesesCount() {
		return getService().getMonthlyExpensesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<MonthlyExpenses> getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static MonthlyExpenses updateMonthlyExpenses(
		MonthlyExpenses monthlyExpenses) {

		return getService().updateMonthlyExpenses(monthlyExpenses);
	}

	public static MonthlyExpensesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MonthlyExpensesLocalService>
		_serviceSnapshot = new Snapshot<>(
			MonthlyExpensesLocalServiceUtil.class,
			MonthlyExpensesLocalService.class);

}