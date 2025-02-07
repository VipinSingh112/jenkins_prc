/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneLocationAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddLocalService
 * @generated
 */
public class SezZoneLocationAddLocalServiceWrapper
	implements ServiceWrapper<SezZoneLocationAddLocalService>,
			   SezZoneLocationAddLocalService {

	public SezZoneLocationAddLocalServiceWrapper() {
		this(null);
	}

	public SezZoneLocationAddLocalServiceWrapper(
		SezZoneLocationAddLocalService sezZoneLocationAddLocalService) {

		_sezZoneLocationAddLocalService = sezZoneLocationAddLocalService;
	}

	/**
	 * Adds the sez zone location add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 * @return the sez zone location add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
		addSezZoneLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
				sezZoneLocationAdd) {

		return _sezZoneLocationAddLocalService.addSezZoneLocationAdd(
			sezZoneLocationAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneLocationAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone location add with the primary key. Does not add the sez zone location add to the database.
	 *
	 * @param sezZoneLocationAddId the primary key for the new sez zone location add
	 * @return the new sez zone location add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
		createSezZoneLocationAdd(long sezZoneLocationAddId) {

		return _sezZoneLocationAddLocalService.createSezZoneLocationAdd(
			sezZoneLocationAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneLocationAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public void deleteSezStatusByAppId(long sezStatusApplicationId) {
		_sezZoneLocationAddLocalService.deleteSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Deletes the sez zone location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add that was removed
	 * @throws PortalException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
			deleteSezZoneLocationAdd(long sezZoneLocationAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneLocationAddLocalService.deleteSezZoneLocationAdd(
			sezZoneLocationAddId);
	}

	/**
	 * Deletes the sez zone location add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 * @return the sez zone location add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
		deleteSezZoneLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
				sezZoneLocationAdd) {

		return _sezZoneLocationAddLocalService.deleteSezZoneLocationAdd(
			sezZoneLocationAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneLocationAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneLocationAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneLocationAddLocalService.dynamicQuery();
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

		return _sezZoneLocationAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddModelImpl</code>.
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

		return _sezZoneLocationAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddModelImpl</code>.
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

		return _sezZoneLocationAddLocalService.dynamicQuery(
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

		return _sezZoneLocationAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezZoneLocationAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
		fetchSezZoneLocationAdd(long sezZoneLocationAddId) {

		return _sezZoneLocationAddLocalService.fetchSezZoneLocationAdd(
			sezZoneLocationAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneLocationAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneLocationAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneLocationAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneLocationAddLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd>
			getSezById(long sezStatusApplicationId) {

		return _sezZoneLocationAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone location add with the primary key.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add
	 * @throws PortalException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
			getSezZoneLocationAdd(long sezZoneLocationAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneLocationAddLocalService.getSezZoneLocationAdd(
			sezZoneLocationAddId);
	}

	/**
	 * Returns a range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of sez zone location adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd>
			getSezZoneLocationAdds(int start, int end) {

		return _sezZoneLocationAddLocalService.getSezZoneLocationAdds(
			start, end);
	}

	/**
	 * Returns the number of sez zone location adds.
	 *
	 * @return the number of sez zone location adds
	 */
	@Override
	public int getSezZoneLocationAddsCount() {
		return _sezZoneLocationAddLocalService.getSezZoneLocationAddsCount();
	}

	/**
	 * Updates the sez zone location add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 * @return the sez zone location add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
		updateSezZoneLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd
				sezZoneLocationAdd) {

		return _sezZoneLocationAddLocalService.updateSezZoneLocationAdd(
			sezZoneLocationAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneLocationAddLocalService.getBasePersistence();
	}

	@Override
	public SezZoneLocationAddLocalService getWrappedService() {
		return _sezZoneLocationAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneLocationAddLocalService sezZoneLocationAddLocalService) {

		_sezZoneLocationAddLocalService = sezZoneLocationAddLocalService;
	}

	private SezZoneLocationAddLocalService _sezZoneLocationAddLocalService;

}