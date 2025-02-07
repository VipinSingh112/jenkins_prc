/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerPersonnelSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecondLocalService
 * @generated
 */
public class AddCerPersonnelSecondLocalServiceWrapper
	implements AddCerPersonnelSecondLocalService,
			   ServiceWrapper<AddCerPersonnelSecondLocalService> {

	public AddCerPersonnelSecondLocalServiceWrapper() {
		this(null);
	}

	public AddCerPersonnelSecondLocalServiceWrapper(
		AddCerPersonnelSecondLocalService addCerPersonnelSecondLocalService) {

		_addCerPersonnelSecondLocalService = addCerPersonnelSecondLocalService;
	}

	/**
	 * Adds the add cer personnel second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelSecond the add cer personnel second
	 * @return the add cer personnel second that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
		addAddCerPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
				addCerPersonnelSecond) {

		return _addCerPersonnelSecondLocalService.addAddCerPersonnelSecond(
			addCerPersonnelSecond);
	}

	/**
	 * Creates a new add cer personnel second with the primary key. Does not add the add cer personnel second to the database.
	 *
	 * @param addCerPersonnelSecondId the primary key for the new add cer personnel second
	 * @return the new add cer personnel second
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
		createAddCerPersonnelSecond(long addCerPersonnelSecondId) {

		return _addCerPersonnelSecondLocalService.createAddCerPersonnelSecond(
			addCerPersonnelSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelSecondLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer personnel second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelSecond the add cer personnel second
	 * @return the add cer personnel second that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
		deleteAddCerPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
				addCerPersonnelSecond) {

		return _addCerPersonnelSecondLocalService.deleteAddCerPersonnelSecond(
			addCerPersonnelSecond);
	}

	/**
	 * Deletes the add cer personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second that was removed
	 * @throws PortalException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
			deleteAddCerPersonnelSecond(long addCerPersonnelSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelSecondLocalService.deleteAddCerPersonnelSecond(
			addCerPersonnelSecondId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelSecondLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerPersonnelSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerPersonnelSecondLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerPersonnelSecondLocalService.dynamicQuery();
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

		return _addCerPersonnelSecondLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondModelImpl</code>.
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

		return _addCerPersonnelSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondModelImpl</code>.
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

		return _addCerPersonnelSecondLocalService.dynamicQuery(
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

		return _addCerPersonnelSecondLocalService.dynamicQueryCount(
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

		return _addCerPersonnelSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
		fetchAddCerPersonnelSecond(long addCerPersonnelSecondId) {

		return _addCerPersonnelSecondLocalService.fetchAddCerPersonnelSecond(
			addCerPersonnelSecondId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerPersonnelSecondLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer personnel second with the primary key.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second
	 * @throws PortalException if a add cer personnel second with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
			getAddCerPersonnelSecond(long addCerPersonnelSecondId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelSecondLocalService.getAddCerPersonnelSecond(
			addCerPersonnelSecondId);
	}

	/**
	 * Returns a range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @return the range of add cer personnel seconds
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond>
			getAddCerPersonnelSeconds(int start, int end) {

		return _addCerPersonnelSecondLocalService.getAddCerPersonnelSeconds(
			start, end);
	}

	/**
	 * Returns the number of add cer personnel seconds.
	 *
	 * @return the number of add cer personnel seconds
	 */
	@Override
	public int getAddCerPersonnelSecondsCount() {
		return _addCerPersonnelSecondLocalService.
			getAddCerPersonnelSecondsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerPersonnelSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerPersonnelSecondLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerPersonnelSecondLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add cer personnel second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelSecond the add cer personnel second
	 * @return the add cer personnel second that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
		updateAddCerPersonnelSecond(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond
				addCerPersonnelSecond) {

		return _addCerPersonnelSecondLocalService.updateAddCerPersonnelSecond(
			addCerPersonnelSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerPersonnelSecondLocalService.getBasePersistence();
	}

	@Override
	public AddCerPersonnelSecondLocalService getWrappedService() {
		return _addCerPersonnelSecondLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerPersonnelSecondLocalService addCerPersonnelSecondLocalService) {

		_addCerPersonnelSecondLocalService = addCerPersonnelSecondLocalService;
	}

	private AddCerPersonnelSecondLocalService
		_addCerPersonnelSecondLocalService;

}