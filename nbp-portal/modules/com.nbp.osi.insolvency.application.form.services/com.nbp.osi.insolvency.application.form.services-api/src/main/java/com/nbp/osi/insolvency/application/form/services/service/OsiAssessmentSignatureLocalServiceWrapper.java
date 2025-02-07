/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiAssessmentSignatureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignatureLocalService
 * @generated
 */
public class OsiAssessmentSignatureLocalServiceWrapper
	implements OsiAssessmentSignatureLocalService,
			   ServiceWrapper<OsiAssessmentSignatureLocalService> {

	public OsiAssessmentSignatureLocalServiceWrapper() {
		this(null);
	}

	public OsiAssessmentSignatureLocalServiceWrapper(
		OsiAssessmentSignatureLocalService osiAssessmentSignatureLocalService) {

		_osiAssessmentSignatureLocalService =
			osiAssessmentSignatureLocalService;
	}

	/**
	 * Adds the osi assessment signature to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature addOsiAssessmentSignature(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssessmentSignature osiAssessmentSignature) {

		return _osiAssessmentSignatureLocalService.addOsiAssessmentSignature(
			osiAssessmentSignature);
	}

	/**
	 * Creates a new osi assessment signature with the primary key. Does not add the osi assessment signature to the database.
	 *
	 * @param osiAssessmentSignatureId the primary key for the new osi assessment signature
	 * @return the new osi assessment signature
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature createOsiAssessmentSignature(
			long osiAssessmentSignatureId) {

		return _osiAssessmentSignatureLocalService.createOsiAssessmentSignature(
			osiAssessmentSignatureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssessmentSignatureLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws PortalException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature deleteOsiAssessmentSignature(
				long osiAssessmentSignatureId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssessmentSignatureLocalService.deleteOsiAssessmentSignature(
			osiAssessmentSignatureId);
	}

	/**
	 * Deletes the osi assessment signature from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature deleteOsiAssessmentSignature(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssessmentSignature osiAssessmentSignature) {

		return _osiAssessmentSignatureLocalService.deleteOsiAssessmentSignature(
			osiAssessmentSignature);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssessmentSignatureLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiAssessmentSignatureLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiAssessmentSignatureLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiAssessmentSignatureLocalService.dynamicQuery();
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

		return _osiAssessmentSignatureLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
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

		return _osiAssessmentSignatureLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
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

		return _osiAssessmentSignatureLocalService.dynamicQuery(
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

		return _osiAssessmentSignatureLocalService.dynamicQueryCount(
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

		return _osiAssessmentSignatureLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature fetchOsiAssessmentSignature(
			long osiAssessmentSignatureId) {

		return _osiAssessmentSignatureLocalService.fetchOsiAssessmentSignature(
			osiAssessmentSignatureId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiAssessmentSignatureLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiAssessmentSignatureLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiAssessmentSignatureLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi assessment signature with the primary key.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws PortalException if a osi assessment signature with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature getOsiAssessmentSignature(
				long osiAssessmentSignatureId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssessmentSignatureLocalService.getOsiAssessmentSignature(
			osiAssessmentSignatureId);
	}

	/**
	 * Returns a range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @return the range of osi assessment signatures
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiAssessmentSignature> getOsiAssessmentSignatures(
				int start, int end) {

		return _osiAssessmentSignatureLocalService.getOsiAssessmentSignatures(
			start, end);
	}

	/**
	 * Returns the number of osi assessment signatures.
	 *
	 * @return the number of osi assessment signatures
	 */
	@Override
	public int getOsiAssessmentSignaturesCount() {
		return _osiAssessmentSignatureLocalService.
			getOsiAssessmentSignaturesCount();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiAssessmentSignatureException {

		return _osiAssessmentSignatureLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssessmentSignatureLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi assessment signature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssessmentSignature updateOsiAssessmentSignature(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssessmentSignature osiAssessmentSignature) {

		return _osiAssessmentSignatureLocalService.updateOsiAssessmentSignature(
			osiAssessmentSignature);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiAssessmentSignatureLocalService.getBasePersistence();
	}

	@Override
	public OsiAssessmentSignatureLocalService getWrappedService() {
		return _osiAssessmentSignatureLocalService;
	}

	@Override
	public void setWrappedService(
		OsiAssessmentSignatureLocalService osiAssessmentSignatureLocalService) {

		_osiAssessmentSignatureLocalService =
			osiAssessmentSignatureLocalService;
	}

	private OsiAssessmentSignatureLocalService
		_osiAssessmentSignatureLocalService;

}