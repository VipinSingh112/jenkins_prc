/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevGenBusinessInfoAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAddLocalService
 * @generated
 */
public class SezDevGenBusinessInfoAddLocalServiceWrapper
	implements ServiceWrapper<SezDevGenBusinessInfoAddLocalService>,
			   SezDevGenBusinessInfoAddLocalService {

	public SezDevGenBusinessInfoAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevGenBusinessInfoAddLocalServiceWrapper(
		SezDevGenBusinessInfoAddLocalService
			sezDevGenBusinessInfoAddLocalService) {

		_sezDevGenBusinessInfoAddLocalService =
			sezDevGenBusinessInfoAddLocalService;
	}

	/**
	 * Adds the sez dev gen business info add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGenBusinessInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGenBusinessInfoAdd the sez dev gen business info add
	 * @return the sez dev gen business info add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd addSezDevGenBusinessInfoAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		return _sezDevGenBusinessInfoAddLocalService.
			addSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevGenBusinessInfoAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev gen business info add with the primary key. Does not add the sez dev gen business info add to the database.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key for the new sez dev gen business info add
	 * @return the new sez dev gen business info add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd createSezDevGenBusinessInfoAdd(
				long sezDevGenBusinessInfoAddId) {

		return _sezDevGenBusinessInfoAddLocalService.
			createSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevGenBusinessInfoAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev gen business info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGenBusinessInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add that was removed
	 * @throws PortalException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd deleteSezDevGenBusinessInfoAdd(
					long sezDevGenBusinessInfoAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevGenBusinessInfoAddLocalService.
			deleteSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAddId);
	}

	/**
	 * Deletes the sez dev gen business info add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGenBusinessInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGenBusinessInfoAdd the sez dev gen business info add
	 * @return the sez dev gen business info add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd deleteSezDevGenBusinessInfoAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		return _sezDevGenBusinessInfoAddLocalService.
			deleteSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevGenBusinessInfoAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevGenBusinessInfoAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevGenBusinessInfoAddLocalService.dynamicQuery();
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

		return _sezDevGenBusinessInfoAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGenBusinessInfoAddModelImpl</code>.
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

		return _sezDevGenBusinessInfoAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGenBusinessInfoAddModelImpl</code>.
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

		return _sezDevGenBusinessInfoAddLocalService.dynamicQuery(
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

		return _sezDevGenBusinessInfoAddLocalService.dynamicQueryCount(
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

		return _sezDevGenBusinessInfoAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd fetchSezDevGenBusinessInfoAdd(
				long sezDevGenBusinessInfoAddId) {

		return _sezDevGenBusinessInfoAddLocalService.
			fetchSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevGenBusinessInfoAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevGenBusinessInfoAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevGenBusinessInfoAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevGenBusinessInfoAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd> getSezById(long sezStatusApplicationId) {

		return _sezDevGenBusinessInfoAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev gen business info add with the primary key.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add
	 * @throws PortalException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd getSezDevGenBusinessInfoAdd(
					long sezDevGenBusinessInfoAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevGenBusinessInfoAddLocalService.
			getSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAddId);
	}

	/**
	 * Returns a range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @return the range of sez dev gen business info adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd> getSezDevGenBusinessInfoAdds(
				int start, int end) {

		return _sezDevGenBusinessInfoAddLocalService.
			getSezDevGenBusinessInfoAdds(start, end);
	}

	/**
	 * Returns the number of sez dev gen business info adds.
	 *
	 * @return the number of sez dev gen business info adds
	 */
	@Override
	public int getSezDevGenBusinessInfoAddsCount() {
		return _sezDevGenBusinessInfoAddLocalService.
			getSezDevGenBusinessInfoAddsCount();
	}

	/**
	 * Updates the sez dev gen business info add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevGenBusinessInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevGenBusinessInfoAdd the sez dev gen business info add
	 * @return the sez dev gen business info add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevGenBusinessInfoAdd updateSezDevGenBusinessInfoAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		return _sezDevGenBusinessInfoAddLocalService.
			updateSezDevGenBusinessInfoAdd(sezDevGenBusinessInfoAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevGenBusinessInfoAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevGenBusinessInfoAddLocalService getWrappedService() {
		return _sezDevGenBusinessInfoAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevGenBusinessInfoAddLocalService
			sezDevGenBusinessInfoAddLocalService) {

		_sezDevGenBusinessInfoAddLocalService =
			sezDevGenBusinessInfoAddLocalService;
	}

	private SezDevGenBusinessInfoAddLocalService
		_sezDevGenBusinessInfoAddLocalService;

}