/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionLocalService
 * @generated
 */
public class ManuInspectionLocalServiceWrapper
	implements ManuInspectionLocalService,
			   ServiceWrapper<ManuInspectionLocalService> {

	public ManuInspectionLocalServiceWrapper() {
		this(null);
	}

	public ManuInspectionLocalServiceWrapper(
		ManuInspectionLocalService manuInspectionLocalService) {

		_manuInspectionLocalService = manuInspectionLocalService;
	}

	/**
	 * Adds the manu inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			addManuInspection(
				com.nbp.manufacturing.application.stages.services.model.
					ManuInspection manuInspection) {

		return _manuInspectionLocalService.addManuInspection(manuInspection);
	}

	/**
	 * Creates a new manu inspection with the primary key. Does not add the manu inspection to the database.
	 *
	 * @param manuInspectionId the primary key for the new manu inspection
	 * @return the new manu inspection
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			createManuInspection(long manuInspectionId) {

		return _manuInspectionLocalService.createManuInspection(
			manuInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws PortalException if a manu inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
				deleteManuInspection(long manuInspectionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInspectionLocalService.deleteManuInspection(
			manuInspectionId);
	}

	/**
	 * Deletes the manu inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			deleteManuInspection(
				com.nbp.manufacturing.application.stages.services.model.
					ManuInspection manuInspection) {

		return _manuInspectionLocalService.deleteManuInspection(manuInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuInspectionLocalService.dynamicQuery();
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

		return _manuInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
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

		return _manuInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
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

		return _manuInspectionLocalService.dynamicQuery(
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

		return _manuInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manuInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			fetchManuInspection(long manuInspectionId) {

		return _manuInspectionLocalService.fetchManuInspection(
			manuInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
				getInspectionByStatus_SlotBoooked(
					String status, long slotBookedByUser,
					long manufacturingApplicationId)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManuInspectionException {

		return _manuInspectionLocalService.getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, manufacturingApplicationId);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
				getManufacturingInspectionBY_CI(String caseId)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManuInspectionException {

		return _manuInspectionLocalService.getManufacturingInspectionBY_CI(
			caseId);
	}

	/**
	 * Returns the manu inspection with the primary key.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws PortalException if a manu inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
				getManuInspection(long manuInspectionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInspectionLocalService.getManuInspection(manuInspectionId);
	}

	/**
	 * Returns a range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of manu inspections
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.ManuInspection>
			getManuInspections(int start, int end) {

		return _manuInspectionLocalService.getManuInspections(start, end);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.ManuInspection>
			getManuInspections(long manufacturingApplicationId) {

		return _manuInspectionLocalService.getManuInspections(
			manufacturingApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.ManuInspection>
			getManuInspectionsByCaseId(String caseId) {

		return _manuInspectionLocalService.getManuInspectionsByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.ManuInspection>
			getManuInspectionsByStatusApplicationId(
				long manufacturingApplicationId, String status) {

		return _manuInspectionLocalService.
			getManuInspectionsByStatusApplicationId(
				manufacturingApplicationId, status);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.ManuInspection>
			getManuInspectionsByStatusCaseId(String caseId, String status) {

		return _manuInspectionLocalService.getManuInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of manu inspections.
	 *
	 * @return the number of manu inspections
	 */
	@Override
	public int getManuInspectionsCount() {
		return _manuInspectionLocalService.getManuInspectionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			updateManuInspection(
				com.nbp.manufacturing.application.stages.services.model.
					ManuInspection manuInspection) {

		return _manuInspectionLocalService.updateManuInspection(manuInspection);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.ManuInspection
			updateManuInspection(
				String caseId, java.util.Date dateOfInspection) {

		return _manuInspectionLocalService.updateManuInspection(
			caseId, dateOfInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuInspectionLocalService.getBasePersistence();
	}

	@Override
	public ManuInspectionLocalService getWrappedService() {
		return _manuInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		ManuInspectionLocalService manuInspectionLocalService) {

		_manuInspectionLocalService = manuInspectionLocalService;
	}

	private ManuInspectionLocalService _manuInspectionLocalService;

}