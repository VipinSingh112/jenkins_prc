/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccLocationAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccLocationAddLocalService
 * @generated
 */
public class SezOccLocationAddLocalServiceWrapper
	implements ServiceWrapper<SezOccLocationAddLocalService>,
			   SezOccLocationAddLocalService {

	public SezOccLocationAddLocalServiceWrapper() {
		this(null);
	}

	public SezOccLocationAddLocalServiceWrapper(
		SezOccLocationAddLocalService sezOccLocationAddLocalService) {

		_sezOccLocationAddLocalService = sezOccLocationAddLocalService;
	}

	/**
	 * Adds the sez occ location add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 * @return the sez occ location add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
		addSezOccLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
				sezOccLocationAdd) {

		return _sezOccLocationAddLocalService.addSezOccLocationAdd(
			sezOccLocationAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccLocationAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occ location add with the primary key. Does not add the sez occ location add to the database.
	 *
	 * @param sezOccLocationAddId the primary key for the new sez occ location add
	 * @return the new sez occ location add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
		createSezOccLocationAdd(long sezOccLocationAddId) {

		return _sezOccLocationAddLocalService.createSezOccLocationAdd(
			sezOccLocationAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccLocationAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occ location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add that was removed
	 * @throws PortalException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
			deleteSezOccLocationAdd(long sezOccLocationAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccLocationAddLocalService.deleteSezOccLocationAdd(
			sezOccLocationAddId);
	}

	/**
	 * Deletes the sez occ location add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 * @return the sez occ location add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
		deleteSezOccLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
				sezOccLocationAdd) {

		return _sezOccLocationAddLocalService.deleteSezOccLocationAdd(
			sezOccLocationAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccLocationAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccLocationAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccLocationAddLocalService.dynamicQuery();
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

		return _sezOccLocationAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccLocationAddModelImpl</code>.
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

		return _sezOccLocationAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccLocationAddModelImpl</code>.
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

		return _sezOccLocationAddLocalService.dynamicQuery(
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

		return _sezOccLocationAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezOccLocationAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
		fetchSezOccLocationAdd(long sezOccLocationAddId) {

		return _sezOccLocationAddLocalService.fetchSezOccLocationAdd(
			sezOccLocationAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccLocationAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccLocationAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccLocationAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccLocationAddLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezOccLocationAdd>
			getSezById(long sezStatusApplicationId) {

		return _sezOccLocationAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occ location add with the primary key.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add
	 * @throws PortalException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
			getSezOccLocationAdd(long sezOccLocationAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccLocationAddLocalService.getSezOccLocationAdd(
			sezOccLocationAddId);
	}

	/**
	 * Returns a range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of sez occ location adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezOccLocationAdd>
			getSezOccLocationAdds(int start, int end) {

		return _sezOccLocationAddLocalService.getSezOccLocationAdds(start, end);
	}

	/**
	 * Returns the number of sez occ location adds.
	 *
	 * @return the number of sez occ location adds
	 */
	@Override
	public int getSezOccLocationAddsCount() {
		return _sezOccLocationAddLocalService.getSezOccLocationAddsCount();
	}

	/**
	 * Updates the sez occ location add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccLocationAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 * @return the sez occ location add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
		updateSezOccLocationAdd(
			com.nbp.sez.status.application.form.service.model.SezOccLocationAdd
				sezOccLocationAdd) {

		return _sezOccLocationAddLocalService.updateSezOccLocationAdd(
			sezOccLocationAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccLocationAddLocalService.getBasePersistence();
	}

	@Override
	public SezOccLocationAddLocalService getWrappedService() {
		return _sezOccLocationAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccLocationAddLocalService sezOccLocationAddLocalService) {

		_sezOccLocationAddLocalService = sezOccLocationAddLocalService;
	}

	private SezOccLocationAddLocalService _sezOccLocationAddLocalService;

}