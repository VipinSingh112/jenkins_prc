/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionLocalService
 * @generated
 */
public class FactoriesInspectionLocalServiceWrapper
	implements FactoriesInspectionLocalService,
			   ServiceWrapper<FactoriesInspectionLocalService> {

	public FactoriesInspectionLocalServiceWrapper() {
		this(null);
	}

	public FactoriesInspectionLocalServiceWrapper(
		FactoriesInspectionLocalService factoriesInspectionLocalService) {

		_factoriesInspectionLocalService = factoriesInspectionLocalService;
	}

	/**
	 * Adds the factories inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was added
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			addFactoriesInspection(
				com.nbp.factories.registration.stage.services.model.
					FactoriesInspection factoriesInspection) {

		return _factoriesInspectionLocalService.addFactoriesInspection(
			factoriesInspection);
	}

	/**
	 * Creates a new factories inspection with the primary key. Does not add the factories inspection to the database.
	 *
	 * @param factoriesInspectionId the primary key for the new factories inspection
	 * @return the new factories inspection
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			createFactoriesInspection(long factoriesInspectionId) {

		return _factoriesInspectionLocalService.createFactoriesInspection(
			factoriesInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was removed
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			deleteFactoriesInspection(
				com.nbp.factories.registration.stage.services.model.
					FactoriesInspection factoriesInspection) {

		return _factoriesInspectionLocalService.deleteFactoriesInspection(
			factoriesInspection);
	}

	/**
	 * Deletes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws PortalException if a factories inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
				deleteFactoriesInspection(long factoriesInspectionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesInspectionLocalService.deleteFactoriesInspection(
			factoriesInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesInspectionLocalService.dynamicQuery();
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

		return _factoriesInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
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

		return _factoriesInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
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

		return _factoriesInspectionLocalService.dynamicQuery(
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

		return _factoriesInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _factoriesInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			fetchFactoriesInspection(long factoriesInspectionId) {

		return _factoriesInspectionLocalService.fetchFactoriesInspection(
			factoriesInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesInspectionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the factories inspection with the primary key.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws PortalException if a factories inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
				getFactoriesInspection(long factoriesInspectionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesInspectionLocalService.getFactoriesInspection(
			factoriesInspectionId);
	}

	/**
	 * Returns a range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of factories inspections
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesInspection> getFactoriesInspections(int start, int end) {

		return _factoriesInspectionLocalService.getFactoriesInspections(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesInspection> getFactoriesInspections(
				long factoriesApplicationId) {

		return _factoriesInspectionLocalService.getFactoriesInspections(
			factoriesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesInspection> getFactoriesInspectionsByCaseId(
				String caseId) {

		return _factoriesInspectionLocalService.getFactoriesInspectionsByCaseId(
			caseId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesInspection> getFactoriesInspectionsByStatusApplicationId(
				long agriApplicationId, String status) {

		return _factoriesInspectionLocalService.
			getFactoriesInspectionsByStatusApplicationId(
				agriApplicationId, status);
	}

	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
				getFactoriesInspectionsByStatusApplicationId(
					String status, long slotBookedByUser,
					long factoriesApplicationId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesInspectionException {

		return _factoriesInspectionLocalService.
			getFactoriesInspectionsByStatusApplicationId(
				status, slotBookedByUser, factoriesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesInspection> getFactoriesInspectionsByStatusCaseId(
				String caseId, String status) {

		return _factoriesInspectionLocalService.
			getFactoriesInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of factories inspections.
	 *
	 * @return the number of factories inspections
	 */
	@Override
	public int getFactoriesInspectionsCount() {
		return _factoriesInspectionLocalService.getFactoriesInspectionsCount();
	}

	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
				getFactoryInspectionBy_CI(String caseId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesInspectionException {

		return _factoriesInspectionLocalService.getFactoryInspectionBy_CI(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesInspectionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was updated
	 */
	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			updateFactoriesInspection(
				com.nbp.factories.registration.stage.services.model.
					FactoriesInspection factoriesInspection) {

		return _factoriesInspectionLocalService.updateFactoriesInspection(
			factoriesInspection);
	}

	@Override
	public
		com.nbp.factories.registration.stage.services.model.FactoriesInspection
			updateFactoriesInspection(
				String caseId, java.util.Date dateOfinspection) {

		return _factoriesInspectionLocalService.updateFactoriesInspection(
			caseId, dateOfinspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesInspectionLocalService.getBasePersistence();
	}

	@Override
	public FactoriesInspectionLocalService getWrappedService() {
		return _factoriesInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesInspectionLocalService factoriesInspectionLocalService) {

		_factoriesInspectionLocalService = factoriesInspectionLocalService;
	}

	private FactoriesInspectionLocalService _factoriesInspectionLocalService;

}