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

import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MonthlyIncome. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyIncomeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomeLocalService
 * @generated
 */
public class MonthlyIncomeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.MonthlyIncomeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MonthlyIncome addMonthlyIncome(MonthlyIncome monthlyIncome) {
		return getService().addMonthlyIncome(monthlyIncome);
	}

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	public static MonthlyIncome createMonthlyIncome(long monthlyIncomeId) {
		return getService().createMonthlyIncome(monthlyIncomeId);
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
	public static MonthlyIncome deleteMonthlyIncome(long monthlyIncomeId)
		throws PortalException {

		return getService().deleteMonthlyIncome(monthlyIncomeId);
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
	public static MonthlyIncome deleteMonthlyIncome(
		MonthlyIncome monthlyIncome) {

		return getService().deleteMonthlyIncome(monthlyIncome);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl</code>.
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

	public static MonthlyIncome fetchMonthlyIncome(long monthlyIncomeId) {
		return getService().fetchMonthlyIncome(monthlyIncomeId);
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
	 * Returns the monthly income with the primary key.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws PortalException if a monthly income with the primary key could not be found
	 */
	public static MonthlyIncome getMonthlyIncome(long monthlyIncomeId)
		throws PortalException {

		return getService().getMonthlyIncome(monthlyIncomeId);
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
	public static List<MonthlyIncome> getMonthlyIncomes(int start, int end) {
		return getService().getMonthlyIncomes(start, end);
	}

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	public static int getMonthlyIncomesCount() {
		return getService().getMonthlyIncomesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static MonthlyIncome getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

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
	 * Updates the monthly income in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MonthlyIncomeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param monthlyIncome the monthly income
	 * @return the monthly income that was updated
	 */
	public static MonthlyIncome updateMonthlyIncome(
		MonthlyIncome monthlyIncome) {

		return getService().updateMonthlyIncome(monthlyIncome);
	}

	public static MonthlyIncomeLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MonthlyIncomeLocalService> _serviceSnapshot =
		new Snapshot<>(
			MonthlyIncomeLocalServiceUtil.class,
			MonthlyIncomeLocalService.class);

}