/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInspectionLocalService
 * @generated
 */
public class QuarryInspectionLocalServiceWrapper
	implements QuarryInspectionLocalService,
			   ServiceWrapper<QuarryInspectionLocalService> {

	public QuarryInspectionLocalServiceWrapper() {
		this(null);
	}

	public QuarryInspectionLocalServiceWrapper(
		QuarryInspectionLocalService quarryInspectionLocalService) {

		_quarryInspectionLocalService = quarryInspectionLocalService;
	}

	/**
	 * Adds the quarry inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was added
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
		addQuarryInspection(
			com.nbp.quarry.stage.service.model.QuarryInspection
				quarryInspection) {

		return _quarryInspectionLocalService.addQuarryInspection(
			quarryInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry inspection with the primary key. Does not add the quarry inspection to the database.
	 *
	 * @param quarryInspectionId the primary key for the new quarry inspection
	 * @return the new quarry inspection
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
		createQuarryInspection(long quarryInspectionId) {

		return _quarryInspectionLocalService.createQuarryInspection(
			quarryInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws PortalException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
			deleteQuarryInspection(long quarryInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInspectionLocalService.deleteQuarryInspection(
			quarryInspectionId);
	}

	/**
	 * Deletes the quarry inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was removed
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
		deleteQuarryInspection(
			com.nbp.quarry.stage.service.model.QuarryInspection
				quarryInspection) {

		return _quarryInspectionLocalService.deleteQuarryInspection(
			quarryInspection);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryInspectionLocalService.dynamicQuery();
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

		return _quarryInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
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

		return _quarryInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
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

		return _quarryInspectionLocalService.dynamicQuery(
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

		return _quarryInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _quarryInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
		fetchQuarryInspection(long quarryInspectionId) {

		return _quarryInspectionLocalService.fetchQuarryInspection(
			quarryInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return _quarryInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_CaseId(String caseId) {

		return _quarryInspectionLocalService.getQuarry_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_CaseIdApplicationId(String status, long quarryApplicationId) {

		return _quarryInspectionLocalService.getQuarry_CaseIdApplicationId(
			status, quarryApplicationId);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_CaseIdStatus(String caseId, String status) {

		return _quarryInspectionLocalService.getQuarry_CaseIdStatus(
			caseId, status);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_FBAI(long quarryApplicationId) {

		return _quarryInspectionLocalService.getQuarry_FBAI(
			quarryApplicationId);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_Status(String status) {

		return _quarryInspectionLocalService.getQuarry_Status(status);
	}

	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarry_StatusApplicationId(String status, long quarryApplicationId) {

		return _quarryInspectionLocalService.getQuarry_StatusApplicationId(
			status, quarryApplicationId);
	}

	/**
	 * Returns the quarry inspection with the primary key.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws PortalException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
			getQuarryInspection(long quarryInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryInspectionLocalService.getQuarryInspection(
			quarryInspectionId);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
			getQuarryInspectionBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return _quarryInspectionLocalService.getQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of quarry inspections
	 */
	@Override
	public java.util.List<com.nbp.quarry.stage.service.model.QuarryInspection>
		getQuarryInspections(int start, int end) {

		return _quarryInspectionLocalService.getQuarryInspections(start, end);
	}

	/**
	 * Returns the number of quarry inspections.
	 *
	 * @return the number of quarry inspections
	 */
	@Override
	public int getQuarryInspectionsCount() {
		return _quarryInspectionLocalService.getQuarryInspectionsCount();
	}

	/**
	 * Updates the quarry inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was updated
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryInspection
		updateQuarryInspection(
			com.nbp.quarry.stage.service.model.QuarryInspection
				quarryInspection) {

		return _quarryInspectionLocalService.updateQuarryInspection(
			quarryInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryInspectionLocalService.getBasePersistence();
	}

	@Override
	public QuarryInspectionLocalService getWrappedService() {
		return _quarryInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryInspectionLocalService quarryInspectionLocalService) {

		_quarryInspectionLocalService = quarryInspectionLocalService;
	}

	private QuarryInspectionLocalService _quarryInspectionLocalService;

}