/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link StatementOfFinancialHistoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistoryLocalService
 * @generated
 */
public class StatementOfFinancialHistoryLocalServiceWrapper
	implements ServiceWrapper<StatementOfFinancialHistoryLocalService>,
			   StatementOfFinancialHistoryLocalService {

	public StatementOfFinancialHistoryLocalServiceWrapper() {
		this(null);
	}

	public StatementOfFinancialHistoryLocalServiceWrapper(
		StatementOfFinancialHistoryLocalService
			statementOfFinancialHistoryLocalService) {

		_statementOfFinancialHistoryLocalService =
			statementOfFinancialHistoryLocalService;
	}

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
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory addStatementOfFinancialHistory(
				com.nbp.cannabis.application.form.services.model.
					StatementOfFinancialHistory statementOfFinancialHistory) {

		return _statementOfFinancialHistoryLocalService.
			addStatementOfFinancialHistory(statementOfFinancialHistory);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new statement of financial history with the primary key. Does not add the statement of financial history to the database.
	 *
	 * @param statementOfFinancialHistoryId the primary key for the new statement of financial history
	 * @return the new statement of financial history
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory createStatementOfFinancialHistory(
				long statementOfFinancialHistoryId) {

		return _statementOfFinancialHistoryLocalService.
			createStatementOfFinancialHistory(statementOfFinancialHistoryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public void deleteSOFH_by_CAI(long cannabisApplicationId) {
		_statementOfFinancialHistoryLocalService.deleteSOFH_by_CAI(
			cannabisApplicationId);
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
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory deleteStatementOfFinancialHistory(
					long statementOfFinancialHistoryId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.
			deleteStatementOfFinancialHistory(statementOfFinancialHistoryId);
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
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory deleteStatementOfFinancialHistory(
				com.nbp.cannabis.application.form.services.model.
					StatementOfFinancialHistory statementOfFinancialHistory) {

		return _statementOfFinancialHistoryLocalService.
			deleteStatementOfFinancialHistory(statementOfFinancialHistory);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _statementOfFinancialHistoryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _statementOfFinancialHistoryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _statementOfFinancialHistoryLocalService.dynamicQuery();
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

		return _statementOfFinancialHistoryLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _statementOfFinancialHistoryLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _statementOfFinancialHistoryLocalService.dynamicQuery(
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

		return _statementOfFinancialHistoryLocalService.dynamicQueryCount(
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

		return _statementOfFinancialHistoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory fetchStatementOfFinancialHistory(
				long statementOfFinancialHistoryId) {

		return _statementOfFinancialHistoryLocalService.
			fetchStatementOfFinancialHistory(statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history matching the UUID and group.
	 *
	 * @param uuid the statement of financial history's UUID
	 * @param groupId the primary key of the group
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory
				fetchStatementOfFinancialHistoryByUuidAndGroupId(
					String uuid, long groupId) {

		return _statementOfFinancialHistoryLocalService.
			fetchStatementOfFinancialHistoryByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _statementOfFinancialHistoryLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _statementOfFinancialHistoryLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _statementOfFinancialHistoryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _statementOfFinancialHistoryLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory> getSOFH_by_CAI(
				long cannabisAppicationId) {

		return _statementOfFinancialHistoryLocalService.getSOFH_by_CAI(
			cannabisAppicationId);
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
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory> getStatementOfFinancialHistories(
				int start, int end) {

		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistories(start, end);
	}

	/**
	 * Returns all the statement of financial histories matching the UUID and company.
	 *
	 * @param uuid the UUID of the statement of financial histories
	 * @param companyId the primary key of the company
	 * @return the matching statement of financial histories, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory>
				getStatementOfFinancialHistoriesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistoriesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory>
				getStatementOfFinancialHistoriesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.cannabis.application.form.services.model.
							StatementOfFinancialHistory> orderByComparator) {

		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistoriesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of statement of financial histories.
	 *
	 * @return the number of statement of financial histories
	 */
	@Override
	public int getStatementOfFinancialHistoriesCount() {
		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistoriesCount();
	}

	/**
	 * Returns the statement of financial history with the primary key.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws PortalException if a statement of financial history with the primary key could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory getStatementOfFinancialHistory(
					long statementOfFinancialHistoryId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistory(statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history matching the UUID and group.
	 *
	 * @param uuid the statement of financial history's UUID
	 * @param groupId the primary key of the group
	 * @return the matching statement of financial history
	 * @throws PortalException if a matching statement of financial history could not be found
	 */
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory
					getStatementOfFinancialHistoryByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _statementOfFinancialHistoryLocalService.
			getStatementOfFinancialHistoryByUuidAndGroupId(uuid, groupId);
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
	@Override
	public
		com.nbp.cannabis.application.form.services.model.
			StatementOfFinancialHistory updateStatementOfFinancialHistory(
				com.nbp.cannabis.application.form.services.model.
					StatementOfFinancialHistory statementOfFinancialHistory) {

		return _statementOfFinancialHistoryLocalService.
			updateStatementOfFinancialHistory(statementOfFinancialHistory);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _statementOfFinancialHistoryLocalService.getBasePersistence();
	}

	@Override
	public StatementOfFinancialHistoryLocalService getWrappedService() {
		return _statementOfFinancialHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		StatementOfFinancialHistoryLocalService
			statementOfFinancialHistoryLocalService) {

		_statementOfFinancialHistoryLocalService =
			statementOfFinancialHistoryLocalService;
	}

	private StatementOfFinancialHistoryLocalService
		_statementOfFinancialHistoryLocalService;

}