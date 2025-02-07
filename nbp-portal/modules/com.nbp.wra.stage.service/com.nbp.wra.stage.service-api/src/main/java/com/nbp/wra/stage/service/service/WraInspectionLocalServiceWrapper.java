/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WraInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionLocalService
 * @generated
 */
public class WraInspectionLocalServiceWrapper
	implements ServiceWrapper<WraInspectionLocalService>,
			   WraInspectionLocalService {

	public WraInspectionLocalServiceWrapper() {
		this(null);
	}

	public WraInspectionLocalServiceWrapper(
		WraInspectionLocalService wraInspectionLocalService) {

		_wraInspectionLocalService = wraInspectionLocalService;
	}

	/**
	 * Adds the wra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection addWraInspection(
		com.nbp.wra.stage.service.model.WraInspection wraInspection) {

		return _wraInspectionLocalService.addWraInspection(wraInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new wra inspection with the primary key. Does not add the wra inspection to the database.
	 *
	 * @param wraInspectionId the primary key for the new wra inspection
	 * @return the new wra inspection
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection createWraInspection(
		long wraInspectionId) {

		return _wraInspectionLocalService.createWraInspection(wraInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraInspectionLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws PortalException if a wra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection deleteWraInspection(
			long wraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraInspectionLocalService.deleteWraInspection(wraInspectionId);
	}

	/**
	 * Deletes the wra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection deleteWraInspection(
		com.nbp.wra.stage.service.model.WraInspection wraInspection) {

		return _wraInspectionLocalService.deleteWraInspection(wraInspection);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraInspectionLocalService.dynamicQuery();
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

		return _wraInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
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

		return _wraInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
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

		return _wraInspectionLocalService.dynamicQuery(
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

		return _wraInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraInspection fetchWraInspection(
		long wraInspectionId) {

		return _wraInspectionLocalService.fetchWraInspection(wraInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.wra.stage.service.model.WraInspection
			getInspecByST_Slot_AppId(
				String status, long slotBookedByUser, long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return _wraInspectionLocalService.getInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWra_CaseId(String caseId) {

		return _wraInspectionLocalService.getWra_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWra_CI_AppId(long wraApplicationId, String status) {

		return _wraInspectionLocalService.getWra_CI_AppId(
			wraApplicationId, status);
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWra_CI_Status(String caseId, String status) {

		return _wraInspectionLocalService.getWra_CI_Status(caseId, status);
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWra_Status(String status) {

		return _wraInspectionLocalService.getWra_Status(status);
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWraById(long wraApplicationId) {

		return _wraInspectionLocalService.getWraById(wraApplicationId);
	}

	/**
	 * Returns the wra inspection with the primary key.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws PortalException if a wra inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection getWraInspection(
			long wraInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraInspectionLocalService.getWraInspection(wraInspectionId);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraInspection getWraInspectionBy_CI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return _wraInspectionLocalService.getWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of wra inspections
	 */
	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraInspection>
		getWraInspections(int start, int end) {

		return _wraInspectionLocalService.getWraInspections(start, end);
	}

	/**
	 * Returns the number of wra inspections.
	 *
	 * @return the number of wra inspections
	 */
	@Override
	public int getWraInspectionsCount() {
		return _wraInspectionLocalService.getWraInspectionsCount();
	}

	@Override
	public com.nbp.wra.stage.service.model.WraInspection updateWraInspection(
		String caseId, java.util.Date dateOfInspection) {

		return _wraInspectionLocalService.updateWraInspection(
			caseId, dateOfInspection);
	}

	/**
	 * Updates the wra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraInspection updateWraInspection(
		com.nbp.wra.stage.service.model.WraInspection wraInspection) {

		return _wraInspectionLocalService.updateWraInspection(wraInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraInspectionLocalService.getBasePersistence();
	}

	@Override
	public WraInspectionLocalService getWrappedService() {
		return _wraInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		WraInspectionLocalService wraInspectionLocalService) {

		_wraInspectionLocalService = wraInspectionLocalService;
	}

	private WraInspectionLocalService _wraInspectionLocalService;

}