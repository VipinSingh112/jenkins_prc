/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevDisasterManagementAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAddLocalService
 * @generated
 */
public class SezDevDisasterManagementAddLocalServiceWrapper
	implements ServiceWrapper<SezDevDisasterManagementAddLocalService>,
			   SezDevDisasterManagementAddLocalService {

	public SezDevDisasterManagementAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevDisasterManagementAddLocalServiceWrapper(
		SezDevDisasterManagementAddLocalService
			sezDevDisasterManagementAddLocalService) {

		_sezDevDisasterManagementAddLocalService =
			sezDevDisasterManagementAddLocalService;
	}

	/**
	 * Adds the sez dev disaster management add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementAdd the sez dev disaster management add
	 * @return the sez dev disaster management add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd addSezDevDisasterManagementAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		return _sezDevDisasterManagementAddLocalService.
			addSezDevDisasterManagementAdd(sezDevDisasterManagementAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev disaster management add with the primary key. Does not add the sez dev disaster management add to the database.
	 *
	 * @param sezDevDisasterManagementAddId the primary key for the new sez dev disaster management add
	 * @return the new sez dev disaster management add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd createSezDevDisasterManagementAdd(
			long sezDevDisasterManagementAddId) {

		return _sezDevDisasterManagementAddLocalService.
			createSezDevDisasterManagementAdd(sezDevDisasterManagementAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev disaster management add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add that was removed
	 * @throws PortalException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd deleteSezDevDisasterManagementAdd(
				long sezDevDisasterManagementAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementAddLocalService.
			deleteSezDevDisasterManagementAdd(sezDevDisasterManagementAddId);
	}

	/**
	 * Deletes the sez dev disaster management add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementAdd the sez dev disaster management add
	 * @return the sez dev disaster management add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd deleteSezDevDisasterManagementAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		return _sezDevDisasterManagementAddLocalService.
			deleteSezDevDisasterManagementAdd(sezDevDisasterManagementAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevDisasterManagementAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevDisasterManagementAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevDisasterManagementAddLocalService.dynamicQuery();
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

		return _sezDevDisasterManagementAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddModelImpl</code>.
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

		return _sezDevDisasterManagementAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddModelImpl</code>.
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

		return _sezDevDisasterManagementAddLocalService.dynamicQuery(
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

		return _sezDevDisasterManagementAddLocalService.dynamicQueryCount(
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

		return _sezDevDisasterManagementAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd fetchSezDevDisasterManagementAdd(
			long sezDevDisasterManagementAddId) {

		return _sezDevDisasterManagementAddLocalService.
			fetchSezDevDisasterManagementAdd(sezDevDisasterManagementAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevDisasterManagementAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevDisasterManagementAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevDisasterManagementAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagementAdd> getSezById(
				long sezStatusApplicationId) {

		return _sezDevDisasterManagementAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev disaster management add with the primary key.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add
	 * @throws PortalException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd getSezDevDisasterManagementAdd(
				long sezDevDisasterManagementAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevDisasterManagementAddLocalService.
			getSezDevDisasterManagementAdd(sezDevDisasterManagementAddId);
	}

	/**
	 * Returns a range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @return the range of sez dev disaster management adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevDisasterManagementAdd> getSezDevDisasterManagementAdds(
				int start, int end) {

		return _sezDevDisasterManagementAddLocalService.
			getSezDevDisasterManagementAdds(start, end);
	}

	/**
	 * Returns the number of sez dev disaster management adds.
	 *
	 * @return the number of sez dev disaster management adds
	 */
	@Override
	public int getSezDevDisasterManagementAddsCount() {
		return _sezDevDisasterManagementAddLocalService.
			getSezDevDisasterManagementAddsCount();
	}

	/**
	 * Updates the sez dev disaster management add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementAdd the sez dev disaster management add
	 * @return the sez dev disaster management add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevDisasterManagementAdd updateSezDevDisasterManagementAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		return _sezDevDisasterManagementAddLocalService.
			updateSezDevDisasterManagementAdd(sezDevDisasterManagementAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevDisasterManagementAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevDisasterManagementAddLocalService getWrappedService() {
		return _sezDevDisasterManagementAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevDisasterManagementAddLocalService
			sezDevDisasterManagementAddLocalService) {

		_sezDevDisasterManagementAddLocalService =
			sezDevDisasterManagementAddLocalService;
	}

	private SezDevDisasterManagementAddLocalService
		_sezDevDisasterManagementAddLocalService;

}