/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionLocalService
 * @generated
 */
public class NcbjInspectionLocalServiceWrapper
	implements NcbjInspectionLocalService,
			   ServiceWrapper<NcbjInspectionLocalService> {

	public NcbjInspectionLocalServiceWrapper() {
		this(null);
	}

	public NcbjInspectionLocalServiceWrapper(
		NcbjInspectionLocalService ncbjInspectionLocalService) {

		_ncbjInspectionLocalService = ncbjInspectionLocalService;
	}

	/**
	 * Adds the ncbj inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjInspection the ncbj inspection
	 * @return the ncbj inspection that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection addNcbjInspection(
		com.nbp.ncbj.stages.services.model.NcbjInspection ncbjInspection) {

		return _ncbjInspectionLocalService.addNcbjInspection(ncbjInspection);
	}

	/**
	 * Creates a new ncbj inspection with the primary key. Does not add the ncbj inspection to the database.
	 *
	 * @param ncbjInspectionId the primary key for the new ncbj inspection
	 * @return the new ncbj inspection
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
		createNcbjInspection(long ncbjInspectionId) {

		return _ncbjInspectionLocalService.createNcbjInspection(
			ncbjInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection that was removed
	 * @throws PortalException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
			deleteNcbjInspection(long ncbjInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjInspectionLocalService.deleteNcbjInspection(
			ncbjInspectionId);
	}

	/**
	 * Deletes the ncbj inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjInspection the ncbj inspection
	 * @return the ncbj inspection that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
		deleteNcbjInspection(
			com.nbp.ncbj.stages.services.model.NcbjInspection ncbjInspection) {

		return _ncbjInspectionLocalService.deleteNcbjInspection(ncbjInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjInspectionLocalService.dynamicQuery();
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

		return _ncbjInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjInspectionModelImpl</code>.
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

		return _ncbjInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjInspectionModelImpl</code>.
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

		return _ncbjInspectionLocalService.dynamicQuery(
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

		return _ncbjInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
		fetchNcbjInspection(long ncbjInspectionId) {

		return _ncbjInspectionLocalService.fetchNcbjInspection(
			ncbjInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
			getInspecByStatus_SlotBook_AppId(
				String status, long slotBookedByUser, long ncbjApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return _ncbjInspectionLocalService.getInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbj_CaseId(String caseId) {

		return _ncbjInspectionLocalService.getNcbj_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbj_CaseIdAppId(String status, long ncbjApplicationId) {

		return _ncbjInspectionLocalService.getNcbj_CaseIdAppId(
			status, ncbjApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbj_CaseIdStatus(String caseId, String status) {

		return _ncbjInspectionLocalService.getNcbj_CaseIdStatus(caseId, status);
	}

	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbj_FBAI(long ncbjApplicationId) {

		return _ncbjInspectionLocalService.getNcbj_FBAI(ncbjApplicationId);
	}

	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbj_Status(String status) {

		return _ncbjInspectionLocalService.getNcbj_Status(status);
	}

	/**
	 * Returns the ncbj inspection with the primary key.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection
	 * @throws PortalException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection getNcbjInspection(
			long ncbjInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjInspectionLocalService.getNcbjInspection(ncbjInspectionId);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
			getNcbjInspectionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return _ncbjInspectionLocalService.getNcbjInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of ncbj inspections
	 */
	@Override
	public java.util.List<com.nbp.ncbj.stages.services.model.NcbjInspection>
		getNcbjInspections(int start, int end) {

		return _ncbjInspectionLocalService.getNcbjInspections(start, end);
	}

	/**
	 * Returns the number of ncbj inspections.
	 *
	 * @return the number of ncbj inspections
	 */
	@Override
	public int getNcbjInspectionsCount() {
		return _ncbjInspectionLocalService.getNcbjInspectionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjInspection the ncbj inspection
	 * @return the ncbj inspection that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjInspection
		updateNcbjInspection(
			com.nbp.ncbj.stages.services.model.NcbjInspection ncbjInspection) {

		return _ncbjInspectionLocalService.updateNcbjInspection(ncbjInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjInspectionLocalService.getBasePersistence();
	}

	@Override
	public NcbjInspectionLocalService getWrappedService() {
		return _ncbjInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjInspectionLocalService ncbjInspectionLocalService) {

		_ncbjInspectionLocalService = ncbjInspectionLocalService;
	}

	private NcbjInspectionLocalService _ncbjInspectionLocalService;

}