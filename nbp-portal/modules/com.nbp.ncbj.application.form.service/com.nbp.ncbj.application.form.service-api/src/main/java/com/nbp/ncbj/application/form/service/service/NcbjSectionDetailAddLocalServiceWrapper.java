/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionDetailAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddLocalService
 * @generated
 */
public class NcbjSectionDetailAddLocalServiceWrapper
	implements NcbjSectionDetailAddLocalService,
			   ServiceWrapper<NcbjSectionDetailAddLocalService> {

	public NcbjSectionDetailAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionDetailAddLocalServiceWrapper(
		NcbjSectionDetailAddLocalService ncbjSectionDetailAddLocalService) {

		_ncbjSectionDetailAddLocalService = ncbjSectionDetailAddLocalService;
	}

	/**
	 * Adds the ncbj section detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
		addNcbjSectionDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
				ncbjSectionDetailAdd) {

		return _ncbjSectionDetailAddLocalService.addNcbjSectionDetailAdd(
			ncbjSectionDetailAdd);
	}

	/**
	 * Creates a new ncbj section detail add with the primary key. Does not add the ncbj section detail add to the database.
	 *
	 * @param ncbjSectionDetailAddId the primary key for the new ncbj section detail add
	 * @return the new ncbj section detail add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
		createNcbjSectionDetailAdd(long ncbjSectionDetailAddId) {

		return _ncbjSectionDetailAddLocalService.createNcbjSectionDetailAdd(
			ncbjSectionDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionDetailAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws PortalException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
			deleteNcbjSectionDetailAdd(long ncbjSectionDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionDetailAddLocalService.deleteNcbjSectionDetailAdd(
			ncbjSectionDetailAddId);
	}

	/**
	 * Deletes the ncbj section detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
		deleteNcbjSectionDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
				ncbjSectionDetailAdd) {

		return _ncbjSectionDetailAddLocalService.deleteNcbjSectionDetailAdd(
			ncbjSectionDetailAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionDetailAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionDetailAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionDetailAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionDetailAddLocalService.dynamicQuery();
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

		return _ncbjSectionDetailAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
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

		return _ncbjSectionDetailAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
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

		return _ncbjSectionDetailAddLocalService.dynamicQuery(
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

		return _ncbjSectionDetailAddLocalService.dynamicQueryCount(
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

		return _ncbjSectionDetailAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
		fetchNcbjSectionDetailAdd(long ncbjSectionDetailAddId) {

		return _ncbjSectionDetailAddLocalService.fetchNcbjSectionDetailAdd(
			ncbjSectionDetailAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionDetailAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionDetailAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjSectionDetailAddLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section detail add with the primary key.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws PortalException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
			getNcbjSectionDetailAdd(long ncbjSectionDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionDetailAddLocalService.getNcbjSectionDetailAdd(
			ncbjSectionDetailAddId);
	}

	/**
	 * Returns a range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of ncbj section detail adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd>
			getNcbjSectionDetailAdds(int start, int end) {

		return _ncbjSectionDetailAddLocalService.getNcbjSectionDetailAdds(
			start, end);
	}

	/**
	 * Returns the number of ncbj section detail adds.
	 *
	 * @return the number of ncbj section detail adds
	 */
	@Override
	public int getNcbjSectionDetailAddsCount() {
		return _ncbjSectionDetailAddLocalService.
			getNcbjSectionDetailAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionDetailAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionDetailAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj section detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 * @return the ncbj section detail add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
		updateNcbjSectionDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd
				ncbjSectionDetailAdd) {

		return _ncbjSectionDetailAddLocalService.updateNcbjSectionDetailAdd(
			ncbjSectionDetailAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionDetailAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionDetailAddLocalService getWrappedService() {
		return _ncbjSectionDetailAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionDetailAddLocalService ncbjSectionDetailAddLocalService) {

		_ncbjSectionDetailAddLocalService = ncbjSectionDetailAddLocalService;
	}

	private NcbjSectionDetailAddLocalService _ncbjSectionDetailAddLocalService;

}