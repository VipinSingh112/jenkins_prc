/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspectionLocalService
 * @generated
 */
public class NcraInspectionLocalServiceWrapper
	implements NcraInspectionLocalService,
			   ServiceWrapper<NcraInspectionLocalService> {

	public NcraInspectionLocalServiceWrapper() {
		this(null);
	}

	public NcraInspectionLocalServiceWrapper(
		NcraInspectionLocalService ncraInspectionLocalService) {

		_ncraInspectionLocalService = ncraInspectionLocalService;
	}

	/**
	 * Adds the ncra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was added
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection addNcraInspection(
		com.nbp.ncra.stages.services.model.NcraInspection ncraInspection) {

		return _ncraInspectionLocalService.addNcraInspection(ncraInspection);
	}

	/**
	 * Creates a new ncra inspection with the primary key. Does not add the ncra inspection to the database.
	 *
	 * @param ncraInspectionId the primary key for the new ncra inspection
	 * @return the new ncra inspection
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
		createNcraInspection(long ncraInspectionId) {

		return _ncraInspectionLocalService.createNcraInspection(
			ncraInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws PortalException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
			deleteNcraInspection(long ncraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraInspectionLocalService.deleteNcraInspection(
			ncraInspectionId);
	}

	/**
	 * Deletes the ncra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was removed
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
		deleteNcraInspection(
			com.nbp.ncra.stages.services.model.NcraInspection ncraInspection) {

		return _ncraInspectionLocalService.deleteNcraInspection(ncraInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraInspectionLocalService.dynamicQuery();
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

		return _ncraInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
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

		return _ncraInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
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

		return _ncraInspectionLocalService.dynamicQuery(
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

		return _ncraInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncraInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
		fetchNcraInspection(long ncraInspectionId) {

		return _ncraInspectionLocalService.fetchNcraInspection(
			ncraInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return _ncraInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_AI(long ncraApplicationId) {

		return _ncraInspectionLocalService.getNcra_AI(ncraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_By_CaseId(String caseId) {

		return _ncraInspectionLocalService.getNcra_By_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_By_Status(String status) {

		return _ncraInspectionLocalService.getNcra_By_Status(status);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_CaseIdApplicationId(String status, long ncraApplicationId) {

		return _ncraInspectionLocalService.getNcra_CaseIdApplicationId(
			status, ncraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_CaseIdStatus(String caseId, String status) {

		return _ncraInspectionLocalService.getNcra_CaseIdStatus(caseId, status);
	}

	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcra_StatusApplicationId(String status, long ncraApplicationId) {

		return _ncraInspectionLocalService.getNcra_StatusApplicationId(
			status, ncraApplicationId);
	}

	/**
	 * Returns the ncra inspection with the primary key.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws PortalException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection getNcraInspection(
			long ncraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraInspectionLocalService.getNcraInspection(ncraInspectionId);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
			getNcraInspectionBy_CI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return _ncraInspectionLocalService.getNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of ncra inspections
	 */
	@Override
	public java.util.List<com.nbp.ncra.stages.services.model.NcraInspection>
		getNcraInspections(int start, int end) {

		return _ncraInspectionLocalService.getNcraInspections(start, end);
	}

	/**
	 * Returns the number of ncra inspections.
	 *
	 * @return the number of ncra inspections
	 */
	@Override
	public int getNcraInspectionsCount() {
		return _ncraInspectionLocalService.getNcraInspectionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was updated
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraInspection
		updateNcraInspection(
			com.nbp.ncra.stages.services.model.NcraInspection ncraInspection) {

		return _ncraInspectionLocalService.updateNcraInspection(ncraInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraInspectionLocalService.getBasePersistence();
	}

	@Override
	public NcraInspectionLocalService getWrappedService() {
		return _ncraInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		NcraInspectionLocalService ncraInspectionLocalService) {

		_ncraInspectionLocalService = ncraInspectionLocalService;
	}

	private NcraInspectionLocalService _ncraInspectionLocalService;

}