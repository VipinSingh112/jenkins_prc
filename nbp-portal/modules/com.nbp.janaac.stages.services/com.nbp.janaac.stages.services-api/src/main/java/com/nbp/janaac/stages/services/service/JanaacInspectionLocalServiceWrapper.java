/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionLocalService
 * @generated
 */
public class JanaacInspectionLocalServiceWrapper
	implements JanaacInspectionLocalService,
			   ServiceWrapper<JanaacInspectionLocalService> {

	public JanaacInspectionLocalServiceWrapper() {
		this(null);
	}

	public JanaacInspectionLocalServiceWrapper(
		JanaacInspectionLocalService janaacInspectionLocalService) {

		_janaacInspectionLocalService = janaacInspectionLocalService;
	}

	/**
	 * Adds the janaac inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was added
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
		addJanaacInspection(
			com.nbp.janaac.stages.services.model.JanaacInspection
				janaacInspection) {

		return _janaacInspectionLocalService.addJanaacInspection(
			janaacInspection);
	}

	/**
	 * Creates a new janaac inspection with the primary key. Does not add the janaac inspection to the database.
	 *
	 * @param janaacInspectionId the primary key for the new janaac inspection
	 * @return the new janaac inspection
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
		createJanaacInspection(long janaacInspectionId) {

		return _janaacInspectionLocalService.createJanaacInspection(
			janaacInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was removed
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
		deleteJanaacInspection(
			com.nbp.janaac.stages.services.model.JanaacInspection
				janaacInspection) {

		return _janaacInspectionLocalService.deleteJanaacInspection(
			janaacInspection);
	}

	/**
	 * Deletes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws PortalException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
			deleteJanaacInspection(long janaacInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacInspectionLocalService.deleteJanaacInspection(
			janaacInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacInspectionLocalService.dynamicQuery();
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

		return _janaacInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
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

		return _janaacInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
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

		return _janaacInspectionLocalService.dynamicQuery(
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

		return _janaacInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _janaacInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
		fetchJanaacInspection(long janaacInspectionId) {

		return _janaacInspectionLocalService.fetchJanaacInspection(
			janaacInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return _janaacInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getJanaac_AI(long janaacApplicationId) {

		return _janaacInspectionLocalService.getJanaac_AI(janaacApplicationId);
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getJanaac_By_CaseId(String caseId) {

		return _janaacInspectionLocalService.getJanaac_By_CaseId(caseId);
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getJanaac_By_Status(String status) {

		return _janaacInspectionLocalService.getJanaac_By_Status(status);
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getJanaac_StatusApplicationId(String status, long janaacApplicationId) {

		return _janaacInspectionLocalService.getJanaac_StatusApplicationId(
			status, janaacApplicationId);
	}

	/**
	 * Returns the janaac inspection with the primary key.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws PortalException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
			getJanaacInspection(long janaacInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacInspectionLocalService.getJanaacInspection(
			janaacInspectionId);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
			getJanaacInspectionBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return _janaacInspectionLocalService.getJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of janaac inspections
	 */
	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getJanaacInspections(int start, int end) {

		return _janaacInspectionLocalService.getJanaacInspections(start, end);
	}

	/**
	 * Returns the number of janaac inspections.
	 *
	 * @return the number of janaac inspections
	 */
	@Override
	public int getJanaacInspectionsCount() {
		return _janaacInspectionLocalService.getJanaacInspectionsCount();
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getNcra_CaseIdApplicationId(String status, long janaacApplicationId) {

		return _janaacInspectionLocalService.getNcra_CaseIdApplicationId(
			status, janaacApplicationId);
	}

	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacInspection>
		getNcra_CaseIdStatus(String caseId, String status) {

		return _janaacInspectionLocalService.getNcra_CaseIdStatus(
			caseId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the janaac inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was updated
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacInspection
		updateJanaacInspection(
			com.nbp.janaac.stages.services.model.JanaacInspection
				janaacInspection) {

		return _janaacInspectionLocalService.updateJanaacInspection(
			janaacInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacInspectionLocalService.getBasePersistence();
	}

	@Override
	public JanaacInspectionLocalService getWrappedService() {
		return _janaacInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacInspectionLocalService janaacInspectionLocalService) {

		_janaacInspectionLocalService = janaacInspectionLocalService;
	}

	private JanaacInspectionLocalService _janaacInspectionLocalService;

}