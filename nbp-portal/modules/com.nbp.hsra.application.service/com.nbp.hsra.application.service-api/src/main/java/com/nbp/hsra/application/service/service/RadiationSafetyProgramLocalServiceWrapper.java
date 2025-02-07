/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RadiationSafetyProgramLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgramLocalService
 * @generated
 */
public class RadiationSafetyProgramLocalServiceWrapper
	implements RadiationSafetyProgramLocalService,
			   ServiceWrapper<RadiationSafetyProgramLocalService> {

	public RadiationSafetyProgramLocalServiceWrapper() {
		this(null);
	}

	public RadiationSafetyProgramLocalServiceWrapper(
		RadiationSafetyProgramLocalService radiationSafetyProgramLocalService) {

		_radiationSafetyProgramLocalService =
			radiationSafetyProgramLocalService;
	}

	/**
	 * Adds the radiation safety program to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyProgramLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 * @return the radiation safety program that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
		addRadiationSafetyProgram(
			com.nbp.hsra.application.service.model.RadiationSafetyProgram
				radiationSafetyProgram) {

		return _radiationSafetyProgramLocalService.addRadiationSafetyProgram(
			radiationSafetyProgram);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyProgramLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new radiation safety program with the primary key. Does not add the radiation safety program to the database.
	 *
	 * @param radiationSafetyProgramId the primary key for the new radiation safety program
	 * @return the new radiation safety program
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
		createRadiationSafetyProgram(long radiationSafetyProgramId) {

		return _radiationSafetyProgramLocalService.createRadiationSafetyProgram(
			radiationSafetyProgramId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyProgramLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the radiation safety program with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyProgramLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program that was removed
	 * @throws PortalException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
			deleteRadiationSafetyProgram(long radiationSafetyProgramId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyProgramLocalService.deleteRadiationSafetyProgram(
			radiationSafetyProgramId);
	}

	/**
	 * Deletes the radiation safety program from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyProgramLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 * @return the radiation safety program that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
		deleteRadiationSafetyProgram(
			com.nbp.hsra.application.service.model.RadiationSafetyProgram
				radiationSafetyProgram) {

		return _radiationSafetyProgramLocalService.deleteRadiationSafetyProgram(
			radiationSafetyProgram);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _radiationSafetyProgramLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _radiationSafetyProgramLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _radiationSafetyProgramLocalService.dynamicQuery();
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

		return _radiationSafetyProgramLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyProgramModelImpl</code>.
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

		return _radiationSafetyProgramLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyProgramModelImpl</code>.
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

		return _radiationSafetyProgramLocalService.dynamicQuery(
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

		return _radiationSafetyProgramLocalService.dynamicQueryCount(
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

		return _radiationSafetyProgramLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
		fetchRadiationSafetyProgram(long radiationSafetyProgramId) {

		return _radiationSafetyProgramLocalService.fetchRadiationSafetyProgram(
			radiationSafetyProgramId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _radiationSafetyProgramLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyProgramException {

		return _radiationSafetyProgramLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _radiationSafetyProgramLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationSafetyProgramLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyProgramLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the radiation safety program with the primary key.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program
	 * @throws PortalException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
			getRadiationSafetyProgram(long radiationSafetyProgramId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _radiationSafetyProgramLocalService.getRadiationSafetyProgram(
			radiationSafetyProgramId);
	}

	/**
	 * Returns a range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @return the range of radiation safety programs
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.RadiationSafetyProgram>
			getRadiationSafetyPrograms(int start, int end) {

		return _radiationSafetyProgramLocalService.getRadiationSafetyPrograms(
			start, end);
	}

	/**
	 * Returns the number of radiation safety programs.
	 *
	 * @return the number of radiation safety programs
	 */
	@Override
	public int getRadiationSafetyProgramsCount() {
		return _radiationSafetyProgramLocalService.
			getRadiationSafetyProgramsCount();
	}

	/**
	 * Updates the radiation safety program in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyProgramLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 * @return the radiation safety program that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.RadiationSafetyProgram
		updateRadiationSafetyProgram(
			com.nbp.hsra.application.service.model.RadiationSafetyProgram
				radiationSafetyProgram) {

		return _radiationSafetyProgramLocalService.updateRadiationSafetyProgram(
			radiationSafetyProgram);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _radiationSafetyProgramLocalService.getBasePersistence();
	}

	@Override
	public RadiationSafetyProgramLocalService getWrappedService() {
		return _radiationSafetyProgramLocalService;
	}

	@Override
	public void setWrappedService(
		RadiationSafetyProgramLocalService radiationSafetyProgramLocalService) {

		_radiationSafetyProgramLocalService =
			radiationSafetyProgramLocalService;
	}

	private RadiationSafetyProgramLocalService
		_radiationSafetyProgramLocalService;

}