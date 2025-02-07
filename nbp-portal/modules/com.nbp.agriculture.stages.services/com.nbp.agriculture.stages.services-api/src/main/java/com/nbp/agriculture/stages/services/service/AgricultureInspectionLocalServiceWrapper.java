/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionLocalService
 * @generated
 */
public class AgricultureInspectionLocalServiceWrapper
	implements AgricultureInspectionLocalService,
			   ServiceWrapper<AgricultureInspectionLocalService> {

	public AgricultureInspectionLocalServiceWrapper() {
		this(null);
	}

	public AgricultureInspectionLocalServiceWrapper(
		AgricultureInspectionLocalService agricultureInspectionLocalService) {

		_agricultureInspectionLocalService = agricultureInspectionLocalService;
	}

	/**
	 * Adds the agriculture inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was added
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		addAgricultureInspection(
			com.nbp.agriculture.stages.services.model.AgricultureInspection
				agricultureInspection) {

		return _agricultureInspectionLocalService.addAgricultureInspection(
			agricultureInspection);
	}

	/**
	 * Creates a new agriculture inspection with the primary key. Does not add the agriculture inspection to the database.
	 *
	 * @param agricultureInspectionId the primary key for the new agriculture inspection
	 * @return the new agriculture inspection
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		createAgricultureInspection(long agricultureInspectionId) {

		return _agricultureInspectionLocalService.createAgricultureInspection(
			agricultureInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was removed
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		deleteAgricultureInspection(
			com.nbp.agriculture.stages.services.model.AgricultureInspection
				agricultureInspection) {

		return _agricultureInspectionLocalService.deleteAgricultureInspection(
			agricultureInspection);
	}

	/**
	 * Deletes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws PortalException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
			deleteAgricultureInspection(long agricultureInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureInspectionLocalService.deleteAgricultureInspection(
			agricultureInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureInspectionLocalService.dynamicQuery();
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

		return _agricultureInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
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

		return _agricultureInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
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

		return _agricultureInspectionLocalService.dynamicQuery(
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

		return _agricultureInspectionLocalService.dynamicQueryCount(
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

		return _agricultureInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		fetchAgricultureInspection(long agricultureInspectionId) {

		return _agricultureInspectionLocalService.fetchAgricultureInspection(
			agricultureInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
			getAgricultureBy_CI(String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return _agricultureInspectionLocalService.getAgricultureBy_CI(caseId);
	}

	/**
	 * Returns the agriculture inspection with the primary key.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws PortalException if a agriculture inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
			getAgricultureInspection(long agricultureInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureInspectionLocalService.getAgricultureInspection(
			agricultureInspectionId);
	}

	/**
	 * Returns a range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of agriculture inspections
	 */
	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureInspection>
			getAgricultureInspections(int start, int end) {

		return _agricultureInspectionLocalService.getAgricultureInspections(
			start, end);
	}

	/**
	 * Returns the number of agriculture inspections.
	 *
	 * @return the number of agriculture inspections
	 */
	@Override
	public int getAgricultureInspectionsCount() {
		return _agricultureInspectionLocalService.
			getAgricultureInspectionsCount();
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureInspection>
			getAgriInspections(long agriApplicationId) {

		return _agricultureInspectionLocalService.getAgriInspections(
			agriApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureInspection>
			getAgriInspectionsByCaseId(String caseId) {

		return _agricultureInspectionLocalService.getAgriInspectionsByCaseId(
			caseId);
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureInspection>
			getAgriInspectionsByStatusApplicationId(
				long agriApplicationId, String status) {

		return _agricultureInspectionLocalService.
			getAgriInspectionsByStatusApplicationId(agriApplicationId, status);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
			getAgriInspectionsByStatusApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return _agricultureInspectionLocalService.
			getAgriInspectionsByStatusApplicationId(
				status, slotBookedByUser, agriApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureInspection>
			getAgriInspectionsByStatusCaseId(String caseId, String status) {

		return _agricultureInspectionLocalService.
			getAgriInspectionsByStatusCaseId(caseId, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureInspectionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was updated
	 */
	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		updateAgricultureInspection(
			com.nbp.agriculture.stages.services.model.AgricultureInspection
				agricultureInspection) {

		return _agricultureInspectionLocalService.updateAgricultureInspection(
			agricultureInspection);
	}

	@Override
	public com.nbp.agriculture.stages.services.model.AgricultureInspection
		updateAgricultureInspection(
			String caseId, java.util.Date dateOfinspection) {

		return _agricultureInspectionLocalService.updateAgricultureInspection(
			caseId, dateOfinspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureInspectionLocalService.getBasePersistence();
	}

	@Override
	public AgricultureInspectionLocalService getWrappedService() {
		return _agricultureInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureInspectionLocalService agricultureInspectionLocalService) {

		_agricultureInspectionLocalService = agricultureInspectionLocalService;
	}

	private AgricultureInspectionLocalService
		_agricultureInspectionLocalService;

}