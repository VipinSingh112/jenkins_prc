/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraInspectionLocalService
 * @generated
 */
public class HsraInspectionLocalServiceWrapper
	implements HsraInspectionLocalService,
			   ServiceWrapper<HsraInspectionLocalService> {

	public HsraInspectionLocalServiceWrapper() {
		this(null);
	}

	public HsraInspectionLocalServiceWrapper(
		HsraInspectionLocalService hsraInspectionLocalService) {

		_hsraInspectionLocalService = hsraInspectionLocalService;
	}

	/**
	 * Adds the hsra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection addHsraInspection(
		com.nbp.hsra.stage.services.model.HsraInspection hsraInspection) {

		return _hsraInspectionLocalService.addHsraInspection(hsraInspection);
	}

	/**
	 * Creates a new hsra inspection with the primary key. Does not add the hsra inspection to the database.
	 *
	 * @param hsraInspectionId the primary key for the new hsra inspection
	 * @return the new hsra inspection
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
		createHsraInspection(long hsraInspectionId) {

		return _hsraInspectionLocalService.createHsraInspection(
			hsraInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the hsra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
		deleteHsraInspection(
			com.nbp.hsra.stage.services.model.HsraInspection hsraInspection) {

		return _hsraInspectionLocalService.deleteHsraInspection(hsraInspection);
	}

	/**
	 * Deletes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws PortalException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
			deleteHsraInspection(long hsraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraInspectionLocalService.deleteHsraInspection(
			hsraInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraInspectionLocalService.dynamicQuery();
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

		return _hsraInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
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

		return _hsraInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
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

		return _hsraInspectionLocalService.dynamicQuery(
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

		return _hsraInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _hsraInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection fetchHsraInspection(
		long hsraInspectionId) {

		return _hsraInspectionLocalService.fetchHsraInspection(
			hsraInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_CaseId(String caseId) {

		return _hsraInspectionLocalService.getHsra_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_CaseIdApplicationId(String status, long hsraApplicationId) {

		return _hsraInspectionLocalService.getHsra_CaseIdApplicationId(
			status, hsraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_CaseIdStatus(String caseId, String status) {

		return _hsraInspectionLocalService.getHsra_CaseIdStatus(caseId, status);
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_FBAI(long hsraApplicationId) {

		return _hsraInspectionLocalService.getHsra_FBAI(hsraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_Status(String status) {

		return _hsraInspectionLocalService.getHsra_Status(status);
	}

	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsra_StatusApplicationId(String status, long hsraApplicationId) {

		return _hsraInspectionLocalService.getHsra_StatusApplicationId(
			status, hsraApplicationId);
	}

	/**
	 * Returns the hsra inspection with the primary key.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws PortalException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection getHsraInspection(
			long hsraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraInspectionLocalService.getHsraInspection(hsraInspectionId);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
			getHsraInspectionBy_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return _hsraInspectionLocalService.getHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of hsra inspections
	 */
	@Override
	public java.util.List<com.nbp.hsra.stage.services.model.HsraInspection>
		getHsraInspections(int start, int end) {

		return _hsraInspectionLocalService.getHsraInspections(start, end);
	}

	/**
	 * Returns the number of hsra inspections.
	 *
	 * @return the number of hsra inspections
	 */
	@Override
	public int getHsraInspectionsCount() {
		return _hsraInspectionLocalService.getHsraInspectionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return _hsraInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the hsra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraInspection
		updateHsraInspection(
			com.nbp.hsra.stage.services.model.HsraInspection hsraInspection) {

		return _hsraInspectionLocalService.updateHsraInspection(hsraInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraInspectionLocalService.getBasePersistence();
	}

	@Override
	public HsraInspectionLocalService getWrappedService() {
		return _hsraInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		HsraInspectionLocalService hsraInspectionLocalService) {

		_hsraInspectionLocalService = hsraInspectionLocalService;
	}

	private HsraInspectionLocalService _hsraInspectionLocalService;

}