/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjNumberEffectiveAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumberEffectiveAddLocalService
 * @generated
 */
public class NcbjNumberEffectiveAddLocalServiceWrapper
	implements NcbjNumberEffectiveAddLocalService,
			   ServiceWrapper<NcbjNumberEffectiveAddLocalService> {

	public NcbjNumberEffectiveAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjNumberEffectiveAddLocalServiceWrapper(
		NcbjNumberEffectiveAddLocalService ncbjNumberEffectiveAddLocalService) {

		_ncbjNumberEffectiveAddLocalService =
			ncbjNumberEffectiveAddLocalService;
	}

	/**
	 * Adds the ncbj number effective add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumberEffectiveAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumberEffectiveAdd the ncbj number effective add
	 * @return the ncbj number effective add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
		addNcbjNumberEffectiveAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
				ncbjNumberEffectiveAdd) {

		return _ncbjNumberEffectiveAddLocalService.addNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAdd);
	}

	/**
	 * Creates a new ncbj number effective add with the primary key. Does not add the ncbj number effective add to the database.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key for the new ncbj number effective add
	 * @return the new ncbj number effective add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
		createNcbjNumberEffectiveAdd(long ncbjNumberEffectiveAddId) {

		return _ncbjNumberEffectiveAddLocalService.createNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumberEffectiveAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj number effective add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumberEffectiveAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add that was removed
	 * @throws PortalException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
			deleteNcbjNumberEffectiveAdd(long ncbjNumberEffectiveAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumberEffectiveAddLocalService.deleteNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAddId);
	}

	/**
	 * Deletes the ncbj number effective add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumberEffectiveAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumberEffectiveAdd the ncbj number effective add
	 * @return the ncbj number effective add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
		deleteNcbjNumberEffectiveAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
				ncbjNumberEffectiveAdd) {

		return _ncbjNumberEffectiveAddLocalService.deleteNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumberEffectiveAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjNumberEffectiveAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjNumberEffectiveAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjNumberEffectiveAddLocalService.dynamicQuery();
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

		return _ncbjNumberEffectiveAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumberEffectiveAddModelImpl</code>.
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

		return _ncbjNumberEffectiveAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumberEffectiveAddModelImpl</code>.
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

		return _ncbjNumberEffectiveAddLocalService.dynamicQuery(
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

		return _ncbjNumberEffectiveAddLocalService.dynamicQueryCount(
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

		return _ncbjNumberEffectiveAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
		fetchNcbjNumberEffectiveAdd(long ncbjNumberEffectiveAddId) {

		return _ncbjNumberEffectiveAddLocalService.fetchNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjNumberEffectiveAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjNumberEffectiveAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjNumberEffectiveAddLocalService.getNCBJById(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj number effective add with the primary key.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add
	 * @throws PortalException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
			getNcbjNumberEffectiveAdd(long ncbjNumberEffectiveAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumberEffectiveAddLocalService.getNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAddId);
	}

	/**
	 * Returns a range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @return the range of ncbj number effective adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd>
			getNcbjNumberEffectiveAdds(int start, int end) {

		return _ncbjNumberEffectiveAddLocalService.getNcbjNumberEffectiveAdds(
			start, end);
	}

	/**
	 * Returns the number of ncbj number effective adds.
	 *
	 * @return the number of ncbj number effective adds
	 */
	@Override
	public int getNcbjNumberEffectiveAddsCount() {
		return _ncbjNumberEffectiveAddLocalService.
			getNcbjNumberEffectiveAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjNumberEffectiveAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumberEffectiveAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj number effective add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumberEffectiveAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumberEffectiveAdd the ncbj number effective add
	 * @return the ncbj number effective add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
		updateNcbjNumberEffectiveAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd
				ncbjNumberEffectiveAdd) {

		return _ncbjNumberEffectiveAddLocalService.updateNcbjNumberEffectiveAdd(
			ncbjNumberEffectiveAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjNumberEffectiveAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjNumberEffectiveAddLocalService getWrappedService() {
		return _ncbjNumberEffectiveAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjNumberEffectiveAddLocalService ncbjNumberEffectiveAddLocalService) {

		_ncbjNumberEffectiveAddLocalService =
			ncbjNumberEffectiveAddLocalService;
	}

	private NcbjNumberEffectiveAddLocalService
		_ncbjNumberEffectiveAddLocalService;

}