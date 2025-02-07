/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for StatementOfFinancialHistory. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.StatementOfFinancialHistoryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistoryLocalService
 * @generated
 */
public class StatementOfFinancialHistoryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.StatementOfFinancialHistoryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the statement of financial history to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatementOfFinancialHistoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 * @return the statement of financial history that was added
	 */
	public static StatementOfFinancialHistory addStatementOfFinancialHistory(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return getService().addStatementOfFinancialHistory(
			statementOfFinancialHistory);
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
	 * Creates a new statement of financial history with the primary key. Does not add the statement of financial history to the database.
	 *
	 * @param statementOfFinancialHistoryId the primary key for the new statement of financial history
	 * @return the new statement of financial history
	 */
	public static StatementOfFinancialHistory createStatementOfFinancialHistory(
		long statementOfFinancialHistoryId) {

		return getService().createStatementOfFinancialHistory(
			statementOfFinancialHistoryId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static void deleteSOFH_by_CAI(long cannabisApplicationId) {
		getService().deleteSOFH_by_CAI(cannabisApplicationId);
	}

	/**
	 * Deletes the statement of financial history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatementOfFinancialHistoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history that was removed
	 * @throws PortalException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory deleteStatementOfFinancialHistory(
			long statementOfFinancialHistoryId)
		throws PortalException {

		return getService().deleteStatementOfFinancialHistory(
			statementOfFinancialHistoryId);
	}

	/**
	 * Deletes the statement of financial history from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatementOfFinancialHistoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 * @return the statement of financial history that was removed
	 */
	public static StatementOfFinancialHistory deleteStatementOfFinancialHistory(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return getService().deleteStatementOfFinancialHistory(
			statementOfFinancialHistory);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.StatementOfFinancialHistoryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.StatementOfFinancialHistoryModelImpl</code>.
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

	public static StatementOfFinancialHistory fetchStatementOfFinancialHistory(
		long statementOfFinancialHistoryId) {

		return getService().fetchStatementOfFinancialHistory(
			statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history matching the UUID and group.
	 *
	 * @param uuid the statement of financial history's UUID
	 * @param groupId the primary key of the group
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory
		fetchStatementOfFinancialHistoryByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchStatementOfFinancialHistoryByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<StatementOfFinancialHistory> getSOFH_by_CAI(
		long cannabisAppicationId) {

		return getService().getSOFH_by_CAI(cannabisAppicationId);
	}

	/**
	 * Returns a range of all the statement of financial histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @return the range of statement of financial histories
	 */
	public static List<StatementOfFinancialHistory>
		getStatementOfFinancialHistories(int start, int end) {

		return getService().getStatementOfFinancialHistories(start, end);
	}

	/**
	 * Returns all the statement of financial histories matching the UUID and company.
	 *
	 * @param uuid the UUID of the statement of financial histories
	 * @param companyId the primary key of the company
	 * @return the matching statement of financial histories, or an empty list if no matches were found
	 */
	public static List<StatementOfFinancialHistory>
		getStatementOfFinancialHistoriesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getStatementOfFinancialHistoriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of statement of financial histories matching the UUID and company.
	 *
	 * @param uuid the UUID of the statement of financial histories
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching statement of financial histories, or an empty list if no matches were found
	 */
	public static List<StatementOfFinancialHistory>
		getStatementOfFinancialHistoriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getService().getStatementOfFinancialHistoriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of statement of financial histories.
	 *
	 * @return the number of statement of financial histories
	 */
	public static int getStatementOfFinancialHistoriesCount() {
		return getService().getStatementOfFinancialHistoriesCount();
	}

	/**
	 * Returns the statement of financial history with the primary key.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws PortalException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory getStatementOfFinancialHistory(
			long statementOfFinancialHistoryId)
		throws PortalException {

		return getService().getStatementOfFinancialHistory(
			statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history matching the UUID and group.
	 *
	 * @param uuid the statement of financial history's UUID
	 * @param groupId the primary key of the group
	 * @return the matching statement of financial history
	 * @throws PortalException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory
			getStatementOfFinancialHistoryByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getStatementOfFinancialHistoryByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Updates the statement of financial history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect StatementOfFinancialHistoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 * @return the statement of financial history that was updated
	 */
	public static StatementOfFinancialHistory updateStatementOfFinancialHistory(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return getService().updateStatementOfFinancialHistory(
			statementOfFinancialHistory);
	}

	public static StatementOfFinancialHistoryLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<StatementOfFinancialHistoryLocalService>
		_serviceSnapshot = new Snapshot<>(
			StatementOfFinancialHistoryLocalServiceUtil.class,
			StatementOfFinancialHistoryLocalService.class);

}