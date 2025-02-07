/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationDeclarationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclarationLocalService
 * @generated
 */
public class RadiationDeclarationLocalServiceWrapper
	implements RadiationDeclarationLocalService,
			   ServiceWrapper<RadiationDeclarationLocalService> {

	public RadiationDeclarationLocalServiceWrapper() {
		this(null);
	}

	public RadiationDeclarationLocalServiceWrapper(
		RadiationDeclarationLocalService radiationDeclarationLocalService) {

		_radiationDeclarationLocalService = radiationDeclarationLocalService;
	}

	/**
	 * Adds the radiation declaration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDeclaration the radiation declaration
	 * @return the radiation declaration that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
		addRadiationDeclaration(
			com.nbp.hsra.application.service.model.RadiationDeclaration
				radiationDeclaration) {

		return _radiationDeclarationLocalService.addRadiationDeclaration(
			radiationDeclaration);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDeclarationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation declaration with the primary key. Does not add the radiation declaration to the database.
	 *
	 * @param radiationDeclarationId the primary key for the new radiation declaration
	 * @return the new radiation declaration
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
		createRadiationDeclaration(long radiationDeclarationId) {

		return _radiationDeclarationLocalService.createRadiationDeclaration(
			radiationDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDeclarationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration that was removed
	 * @throws PortalException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
			deleteRadiationDeclaration(long radiationDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDeclarationLocalService.deleteRadiationDeclaration(
			radiationDeclarationId);
	}

	/**
	 * Deletes the radiation declaration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDeclaration the radiation declaration
	 * @return the radiation declaration that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
		deleteRadiationDeclaration(
			com.nbp.hsra.application.service.model.RadiationDeclaration
				radiationDeclaration) {

		return _radiationDeclarationLocalService.deleteRadiationDeclaration(
			radiationDeclaration);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationDeclarationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationDeclarationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationDeclarationLocalService.dynamicQuery();
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

		return _radiationDeclarationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDeclarationModelImpl</code>.
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

		return _radiationDeclarationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDeclarationModelImpl</code>.
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

		return _radiationDeclarationLocalService.dynamicQuery(
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

		return _radiationDeclarationLocalService.dynamicQueryCount(
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

		return _radiationDeclarationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
		fetchRadiationDeclaration(long radiationDeclarationId) {

		return _radiationDeclarationLocalService.fetchRadiationDeclaration(
			radiationDeclarationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationDeclarationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDeclarationException {

		return _radiationDeclarationLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationDeclarationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationDeclarationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDeclarationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation declaration with the primary key.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration
	 * @throws PortalException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
			getRadiationDeclaration(long radiationDeclarationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationDeclarationLocalService.getRadiationDeclaration(
			radiationDeclarationId);
	}

	/**
	 * Returns a range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @return the range of radiation declarations
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationDeclaration>
			getRadiationDeclarations(int start, int end) {

		return _radiationDeclarationLocalService.getRadiationDeclarations(
			start, end);
	}

	/**
	 * Returns the number of radiation declarations.
	 *
	 * @return the number of radiation declarations
	 */
	@Override
	public int getRadiationDeclarationsCount() {
		return _radiationDeclarationLocalService.
			getRadiationDeclarationsCount();
	}

	/**
	 * Updates the radiation declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationDeclaration the radiation declaration
	 * @return the radiation declaration that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationDeclaration
		updateRadiationDeclaration(
			com.nbp.hsra.application.service.model.RadiationDeclaration
				radiationDeclaration) {

		return _radiationDeclarationLocalService.updateRadiationDeclaration(
			radiationDeclaration);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationDeclarationLocalService.getBasePersistence();
	}

	@Override
	public RadiationDeclarationLocalService getWrappedService() {
		return _radiationDeclarationLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationDeclarationLocalService radiationDeclarationLocalService) {

		_radiationDeclarationLocalService = radiationDeclarationLocalService;
	}

	private RadiationDeclarationLocalService _radiationDeclarationLocalService;

}