/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicSafeguardGoodAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddLocalService
 * @generated
 */
public class MiicSafeguardGoodAddLocalServiceWrapper
	implements MiicSafeguardGoodAddLocalService,
			   ServiceWrapper<MiicSafeguardGoodAddLocalService> {

	public MiicSafeguardGoodAddLocalServiceWrapper() {
		this(null);
	}

	public MiicSafeguardGoodAddLocalServiceWrapper(
		MiicSafeguardGoodAddLocalService miicSafeguardGoodAddLocalService) {

		_miicSafeguardGoodAddLocalService = miicSafeguardGoodAddLocalService;
	}

	/**
	 * Adds the miic safeguard good add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardGoodAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 * @return the miic safeguard good add that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
		addMiicSafeguardGoodAdd(
			com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
				miicSafeguardGoodAdd) {

		return _miicSafeguardGoodAddLocalService.addMiicSafeguardGoodAdd(
			miicSafeguardGoodAdd);
	}

	/**
	 * Creates a new miic safeguard good add with the primary key. Does not add the miic safeguard good add to the database.
	 *
	 * @param miicSafeguardGoodAddId the primary key for the new miic safeguard good add
	 * @return the new miic safeguard good add
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
		createMiicSafeguardGoodAdd(long miicSafeguardGoodAddId) {

		return _miicSafeguardGoodAddLocalService.createMiicSafeguardGoodAdd(
			miicSafeguardGoodAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardGoodAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic safeguard good add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardGoodAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 * @throws PortalException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
			deleteMiicSafeguardGoodAdd(long miicSafeguardGoodAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardGoodAddLocalService.deleteMiicSafeguardGoodAdd(
			miicSafeguardGoodAddId);
	}

	/**
	 * Deletes the miic safeguard good add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardGoodAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
		deleteMiicSafeguardGoodAdd(
			com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
				miicSafeguardGoodAdd) {

		return _miicSafeguardGoodAddLocalService.deleteMiicSafeguardGoodAdd(
			miicSafeguardGoodAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardGoodAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicSafeguardGoodAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicSafeguardGoodAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicSafeguardGoodAddLocalService.dynamicQuery();
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

		return _miicSafeguardGoodAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddModelImpl</code>.
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

		return _miicSafeguardGoodAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddModelImpl</code>.
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

		return _miicSafeguardGoodAddLocalService.dynamicQuery(
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

		return _miicSafeguardGoodAddLocalService.dynamicQueryCount(
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

		return _miicSafeguardGoodAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
		fetchMiicSafeguardGoodAdd(long miicSafeguardGoodAddId) {

		return _miicSafeguardGoodAddLocalService.fetchMiicSafeguardGoodAdd(
			miicSafeguardGoodAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicSafeguardGoodAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicSafeguardGoodAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd>
			getMiicById(long applicationId) {

		return _miicSafeguardGoodAddLocalService.getMiicById(applicationId);
	}

	/**
	 * Returns the miic safeguard good add with the primary key.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add
	 * @throws PortalException if a miic safeguard good add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
			getMiicSafeguardGoodAdd(long miicSafeguardGoodAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardGoodAddLocalService.getMiicSafeguardGoodAdd(
			miicSafeguardGoodAddId);
	}

	/**
	 * Returns a range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of miic safeguard good adds
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd>
			getMiicSafeguardGoodAdds(int start, int end) {

		return _miicSafeguardGoodAddLocalService.getMiicSafeguardGoodAdds(
			start, end);
	}

	/**
	 * Returns the number of miic safeguard good adds.
	 *
	 * @return the number of miic safeguard good adds
	 */
	@Override
	public int getMiicSafeguardGoodAddsCount() {
		return _miicSafeguardGoodAddLocalService.
			getMiicSafeguardGoodAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSafeguardGoodAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardGoodAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic safeguard good add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardGoodAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 * @return the miic safeguard good add that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
		updateMiicSafeguardGoodAdd(
			com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd
				miicSafeguardGoodAdd) {

		return _miicSafeguardGoodAddLocalService.updateMiicSafeguardGoodAdd(
			miicSafeguardGoodAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicSafeguardGoodAddLocalService.getBasePersistence();
	}

	@Override
	public MiicSafeguardGoodAddLocalService getWrappedService() {
		return _miicSafeguardGoodAddLocalService;
	}

	@Override
	public void setWrappedService(
		MiicSafeguardGoodAddLocalService miicSafeguardGoodAddLocalService) {

		_miicSafeguardGoodAddLocalService = miicSafeguardGoodAddLocalService;
	}

	private MiicSafeguardGoodAddLocalService _miicSafeguardGoodAddLocalService;

}