/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevProposedProjectLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectLocalService
 * @generated
 */
public class SezDevProposedProjectLocalServiceWrapper
	implements ServiceWrapper<SezDevProposedProjectLocalService>,
			   SezDevProposedProjectLocalService {

	public SezDevProposedProjectLocalServiceWrapper() {
		this(null);
	}

	public SezDevProposedProjectLocalServiceWrapper(
		SezDevProposedProjectLocalService sezDevProposedProjectLocalService) {

		_sezDevProposedProjectLocalService = sezDevProposedProjectLocalService;
	}

	/**
	 * Adds the sez dev proposed project to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 * @return the sez dev proposed project that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
			addSezDevProposedProject(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProject sezDevProposedProject) {

		return _sezDevProposedProjectLocalService.addSezDevProposedProject(
			sezDevProposedProject);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev proposed project with the primary key. Does not add the sez dev proposed project to the database.
	 *
	 * @param sezDevProposedProjectId the primary key for the new sez dev proposed project
	 * @return the new sez dev proposed project
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
			createSezDevProposedProject(long sezDevProposedProjectId) {

		return _sezDevProposedProjectLocalService.createSezDevProposedProject(
			sezDevProposedProjectId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev proposed project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 * @throws PortalException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
				deleteSezDevProposedProject(long sezDevProposedProjectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectLocalService.deleteSezDevProposedProject(
			sezDevProposedProjectId);
	}

	/**
	 * Deletes the sez dev proposed project from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
			deleteSezDevProposedProject(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProject sezDevProposedProject) {

		return _sezDevProposedProjectLocalService.deleteSezDevProposedProject(
			sezDevProposedProject);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevProposedProjectLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevProposedProjectLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevProposedProjectLocalService.dynamicQuery();
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

		return _sezDevProposedProjectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectModelImpl</code>.
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

		return _sezDevProposedProjectLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectModelImpl</code>.
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

		return _sezDevProposedProjectLocalService.dynamicQuery(
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

		return _sezDevProposedProjectLocalService.dynamicQueryCount(
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

		return _sezDevProposedProjectLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
			fetchSezDevProposedProject(long sezDevProposedProjectId) {

		return _sezDevProposedProjectLocalService.fetchSezDevProposedProject(
			sezDevProposedProjectId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevProposedProjectLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevProposedProjectLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevProposedProjectLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezDevProposedProjectException {

		return _sezDevProposedProjectLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev proposed project with the primary key.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project
	 * @throws PortalException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
				getSezDevProposedProject(long sezDevProposedProjectId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectLocalService.getSezDevProposedProject(
			sezDevProposedProjectId);
	}

	/**
	 * Returns a range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @return the range of sez dev proposed projects
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevProposedProject> getSezDevProposedProjects(
				int start, int end) {

		return _sezDevProposedProjectLocalService.getSezDevProposedProjects(
			start, end);
	}

	/**
	 * Returns the number of sez dev proposed projects.
	 *
	 * @return the number of sez dev proposed projects
	 */
	@Override
	public int getSezDevProposedProjectsCount() {
		return _sezDevProposedProjectLocalService.
			getSezDevProposedProjectsCount();
	}

	/**
	 * Updates the sez dev proposed project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 * @return the sez dev proposed project that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevProposedProject
			updateSezDevProposedProject(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProject sezDevProposedProject) {

		return _sezDevProposedProjectLocalService.updateSezDevProposedProject(
			sezDevProposedProject);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevProposedProjectLocalService.getBasePersistence();
	}

	@Override
	public SezDevProposedProjectLocalService getWrappedService() {
		return _sezDevProposedProjectLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevProposedProjectLocalService sezDevProposedProjectLocalService) {

		_sezDevProposedProjectLocalService = sezDevProposedProjectLocalService;
	}

	private SezDevProposedProjectLocalService
		_sezDevProposedProjectLocalService;

}