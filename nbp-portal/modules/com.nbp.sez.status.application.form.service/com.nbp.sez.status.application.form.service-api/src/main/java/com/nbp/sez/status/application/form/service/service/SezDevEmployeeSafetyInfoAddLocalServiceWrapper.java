/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevEmployeeSafetyInfoAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAddLocalService
 * @generated
 */
public class SezDevEmployeeSafetyInfoAddLocalServiceWrapper
	implements ServiceWrapper<SezDevEmployeeSafetyInfoAddLocalService>,
			   SezDevEmployeeSafetyInfoAddLocalService {

	public SezDevEmployeeSafetyInfoAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevEmployeeSafetyInfoAddLocalServiceWrapper(
		SezDevEmployeeSafetyInfoAddLocalService
			sezDevEmployeeSafetyInfoAddLocalService) {

		_sezDevEmployeeSafetyInfoAddLocalService =
			sezDevEmployeeSafetyInfoAddLocalService;
	}

	/**
	 * Adds the sez dev employee safety info add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd addSezDevEmployeeSafetyInfoAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			addSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeSafetyInfoAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev employee safety info add with the primary key. Does not add the sez dev employee safety info add to the database.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key for the new sez dev employee safety info add
	 * @return the new sez dev employee safety info add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd createSezDevEmployeeSafetyInfoAdd(
			long sezDevEmployeeSafetyInfoAddId) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			createSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeSafetyInfoAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws PortalException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd deleteSezDevEmployeeSafetyInfoAdd(
				long sezDevEmployeeSafetyInfoAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			deleteSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Deletes the sez dev employee safety info add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd deleteSezDevEmployeeSafetyInfoAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			deleteSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevEmployeeSafetyInfoAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevEmployeeSafetyInfoAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQuery();
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

		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
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

		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
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

		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQuery(
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

		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQueryCount(
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

		return _sezDevEmployeeSafetyInfoAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd fetchSezDevEmployeeSafetyInfoAdd(
			long sezDevEmployeeSafetyInfoAddId) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			fetchSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmployeeSafetyInfoAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeSafetyInfoAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevEmployeeSafetyInfoAdd> getSezById(
				long sezStatusApplicationId) {

		return _sezDevEmployeeSafetyInfoAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws PortalException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd getSezDevEmployeeSafetyInfoAdd(
				long sezDevEmployeeSafetyInfoAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			getSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Returns a range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of sez dev employee safety info adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevEmployeeSafetyInfoAdd> getSezDevEmployeeSafetyInfoAdds(
				int start, int end) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			getSezDevEmployeeSafetyInfoAdds(start, end);
	}

	/**
	 * Returns the number of sez dev employee safety info adds.
	 *
	 * @return the number of sez dev employee safety info adds
	 */
	@Override
	public int getSezDevEmployeeSafetyInfoAddsCount() {
		return _sezDevEmployeeSafetyInfoAddLocalService.
			getSezDevEmployeeSafetyInfoAddsCount();
	}

	/**
	 * Updates the sez dev employee safety info add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeSafetyInfoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeSafetyInfoAdd updateSezDevEmployeeSafetyInfoAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		return _sezDevEmployeeSafetyInfoAddLocalService.
			updateSezDevEmployeeSafetyInfoAdd(sezDevEmployeeSafetyInfoAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevEmployeeSafetyInfoAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevEmployeeSafetyInfoAddLocalService getWrappedService() {
		return _sezDevEmployeeSafetyInfoAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevEmployeeSafetyInfoAddLocalService
			sezDevEmployeeSafetyInfoAddLocalService) {

		_sezDevEmployeeSafetyInfoAddLocalService =
			sezDevEmployeeSafetyInfoAddLocalService;
	}

	private SezDevEmployeeSafetyInfoAddLocalService
		_sezDevEmployeeSafetyInfoAddLocalService;

}