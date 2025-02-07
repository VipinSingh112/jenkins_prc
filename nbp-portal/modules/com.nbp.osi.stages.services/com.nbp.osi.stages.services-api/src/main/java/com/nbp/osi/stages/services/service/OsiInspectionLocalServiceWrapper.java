/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionLocalService
 * @generated
 */
public class OsiInspectionLocalServiceWrapper
	implements OsiInspectionLocalService,
			   ServiceWrapper<OsiInspectionLocalService> {

	public OsiInspectionLocalServiceWrapper() {
		this(null);
	}

	public OsiInspectionLocalServiceWrapper(
		OsiInspectionLocalService osiInspectionLocalService) {

		_osiInspectionLocalService = osiInspectionLocalService;
	}

	/**
	 * Adds the osi inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was added
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection addOsiInspection(
		com.nbp.osi.stages.services.model.OsiInspection osiInspection) {

		return _osiInspectionLocalService.addOsiInspection(osiInspection);
	}

	/**
	 * Creates a new osi inspection with the primary key. Does not add the osi inspection to the database.
	 *
	 * @param osiInspectionId the primary key for the new osi inspection
	 * @return the new osi inspection
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection createOsiInspection(
		long osiInspectionId) {

		return _osiInspectionLocalService.createOsiInspection(osiInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws PortalException if a osi inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection deleteOsiInspection(
			long osiInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInspectionLocalService.deleteOsiInspection(osiInspectionId);
	}

	/**
	 * Deletes the osi inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was removed
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection deleteOsiInspection(
		com.nbp.osi.stages.services.model.OsiInspection osiInspection) {

		return _osiInspectionLocalService.deleteOsiInspection(osiInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInspectionLocalService.dynamicQuery();
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

		return _osiInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
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

		return _osiInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
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

		return _osiInspectionLocalService.dynamicQuery(
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

		return _osiInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiInspection fetchOsiInspection(
		long osiInspectionId) {

		return _osiInspectionLocalService.fetchOsiInspection(osiInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiInspection
			getInspectionByStatus_SlotBoooked(
				String status, long slotBookedByUser, long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return _osiInspectionLocalService.getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, osiApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi inspection with the primary key.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws PortalException if a osi inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection getOsiInspection(
			long osiInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInspectionLocalService.getOsiInspection(osiInspectionId);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiInspection
			getOsiInspectionBY_CI(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return _osiInspectionLocalService.getOsiInspectionBY_CI(caseId);
	}

	/**
	 * Returns a range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of osi inspections
	 */
	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiInspection>
		getOsiInspections(int start, int end) {

		return _osiInspectionLocalService.getOsiInspections(start, end);
	}

	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiInspection>
		getOSIInspections(long osiApplicationId) {

		return _osiInspectionLocalService.getOSIInspections(osiApplicationId);
	}

	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiInspection>
		getOSIInspectionsByCaseId(String caseId) {

		return _osiInspectionLocalService.getOSIInspectionsByCaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiInspection>
		getOSIInspectionsByStatusApplicationId(
			long osiApplicationId, String status) {

		return _osiInspectionLocalService.
			getOSIInspectionsByStatusApplicationId(osiApplicationId, status);
	}

	@Override
	public java.util.List<com.nbp.osi.stages.services.model.OsiInspection>
		getOSIInspectionsByStatusCaseId(String caseId, String status) {

		return _osiInspectionLocalService.getOSIInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of osi inspections.
	 *
	 * @return the number of osi inspections
	 */
	@Override
	public int getOsiInspectionsCount() {
		return _osiInspectionLocalService.getOsiInspectionsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiInspection updateManuInspection(
		String caseId, java.util.Date dateOfInspection) {

		return _osiInspectionLocalService.updateManuInspection(
			caseId, dateOfInspection);
	}

	/**
	 * Updates the osi inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was updated
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiInspection updateOsiInspection(
		com.nbp.osi.stages.services.model.OsiInspection osiInspection) {

		return _osiInspectionLocalService.updateOsiInspection(osiInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInspectionLocalService.getBasePersistence();
	}

	@Override
	public OsiInspectionLocalService getWrappedService() {
		return _osiInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInspectionLocalService osiInspectionLocalService) {

		_osiInspectionLocalService = osiInspectionLocalService;
	}

	private OsiInspectionLocalService _osiInspectionLocalService;

}