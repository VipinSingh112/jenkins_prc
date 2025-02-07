/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscAppliPreInitiationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreInitiationLocalService
 * @generated
 */
public class JadscAppliPreInitiationLocalServiceWrapper
	implements JadscAppliPreInitiationLocalService,
			   ServiceWrapper<JadscAppliPreInitiationLocalService> {

	public JadscAppliPreInitiationLocalServiceWrapper() {
		this(null);
	}

	public JadscAppliPreInitiationLocalServiceWrapper(
		JadscAppliPreInitiationLocalService
			jadscAppliPreInitiationLocalService) {

		_jadscAppliPreInitiationLocalService =
			jadscAppliPreInitiationLocalService;
	}

	/**
	 * Adds the jadsc appli pre initiation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was added
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
		addJadscAppliPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
				jadscAppliPreInitiation) {

		return _jadscAppliPreInitiationLocalService.addJadscAppliPreInitiation(
			jadscAppliPreInitiation);
	}

	/**
	 * Creates a new jadsc appli pre initiation with the primary key. Does not add the jadsc appli pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc appli pre initiation
	 * @return the new jadsc appli pre initiation
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
		createJadscAppliPreInitiation(long jadscAppliPreInitiationId) {

		return _jadscAppliPreInitiationLocalService.
			createJadscAppliPreInitiation(jadscAppliPreInitiationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreInitiationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc appli pre initiation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
		deleteJadscAppliPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
				jadscAppliPreInitiation) {

		return _jadscAppliPreInitiationLocalService.
			deleteJadscAppliPreInitiation(jadscAppliPreInitiation);
	}

	/**
	 * Deletes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws PortalException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
			deleteJadscAppliPreInitiation(long jadscAppliPreInitiationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreInitiationLocalService.
			deleteJadscAppliPreInitiation(jadscAppliPreInitiationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreInitiationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscAppliPreInitiationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscAppliPreInitiationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscAppliPreInitiationLocalService.dynamicQuery();
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

		return _jadscAppliPreInitiationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
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

		return _jadscAppliPreInitiationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
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

		return _jadscAppliPreInitiationLocalService.dynamicQuery(
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

		return _jadscAppliPreInitiationLocalService.dynamicQueryCount(
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

		return _jadscAppliPreInitiationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
		fetchJadscAppliPreInitiation(long jadscAppliPreInitiationId) {

		return _jadscAppliPreInitiationLocalService.
			fetchJadscAppliPreInitiation(jadscAppliPreInitiationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscAppliPreInitiationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscAppliPreInitiationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws PortalException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
			getJadscAppliPreInitiation(long jadscAppliPreInitiationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreInitiationLocalService.getJadscAppliPreInitiation(
			jadscAppliPreInitiationId);
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of jadsc appli pre initiations
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation>
			getJadscAppliPreInitiations(int start, int end) {

		return _jadscAppliPreInitiationLocalService.getJadscAppliPreInitiations(
			start, end);
	}

	/**
	 * Returns the number of jadsc appli pre initiations.
	 *
	 * @return the number of jadsc appli pre initiations
	 */
	@Override
	public int getJadscAppliPreInitiationsCount() {
		return _jadscAppliPreInitiationLocalService.
			getJadscAppliPreInitiationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliPreInitiationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscAppliPreInitiationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jadsc appli pre initiation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was updated
	 */
	@Override
	public com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
		updateJadscAppliPreInitiation(
			com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation
				jadscAppliPreInitiation) {

		return _jadscAppliPreInitiationLocalService.
			updateJadscAppliPreInitiation(jadscAppliPreInitiation);
	}

	@Override
	public JadscAppliPreInitiationLocalService getWrappedService() {
		return _jadscAppliPreInitiationLocalService;
	}

	@Override
	public void setWrappedService(
		JadscAppliPreInitiationLocalService
			jadscAppliPreInitiationLocalService) {

		_jadscAppliPreInitiationLocalService =
			jadscAppliPreInitiationLocalService;
	}

	private JadscAppliPreInitiationLocalService
		_jadscAppliPreInitiationLocalService;

}