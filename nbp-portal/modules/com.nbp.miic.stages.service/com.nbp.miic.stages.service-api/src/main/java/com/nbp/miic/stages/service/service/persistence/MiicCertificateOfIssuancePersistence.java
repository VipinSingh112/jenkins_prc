/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.stages.service.exception.NoSuchMiicCertificateOfIssuanceException;
import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic certificate of issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuanceUtil
 * @generated
 */
@ProviderType
public interface MiicCertificateOfIssuancePersistence
	extends BasePersistence<MiicCertificateOfIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicCertificateOfIssuanceUtil} to access the miic certificate of issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a matching miic certificate of issuance could not be found
	 */
	public MiicCertificateOfIssuance findBygetMiic_CI_by_CI(String caseId)
		throws NoSuchMiicCertificateOfIssuanceException;

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	public MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(String caseId);

	/**
	 * Returns the miic certificate of issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic certificate of issuance, or <code>null</code> if a matching miic certificate of issuance could not be found
	 */
	public MiicCertificateOfIssuance fetchBygetMiic_CI_by_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the miic certificate of issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic certificate of issuance that was removed
	 */
	public MiicCertificateOfIssuance removeBygetMiic_CI_by_CI(String caseId)
		throws NoSuchMiicCertificateOfIssuanceException;

	/**
	 * Returns the number of miic certificate of issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic certificate of issuances
	 */
	public int countBygetMiic_CI_by_CI(String caseId);

	/**
	 * Caches the miic certificate of issuance in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 */
	public void cacheResult(
		MiicCertificateOfIssuance miicCertificateOfIssuance);

	/**
	 * Caches the miic certificate of issuances in the entity cache if it is enabled.
	 *
	 * @param miicCertificateOfIssuances the miic certificate of issuances
	 */
	public void cacheResult(
		java.util.List<MiicCertificateOfIssuance> miicCertificateOfIssuances);

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	public MiicCertificateOfIssuance create(long miicCertificateOfIssuanceId);

	/**
	 * Removes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	public MiicCertificateOfIssuance remove(long miicCertificateOfIssuanceId)
		throws NoSuchMiicCertificateOfIssuanceException;

	public MiicCertificateOfIssuance updateImpl(
		MiicCertificateOfIssuance miicCertificateOfIssuance);

	/**
	 * Returns the miic certificate of issuance with the primary key or throws a <code>NoSuchMiicCertificateOfIssuanceException</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws NoSuchMiicCertificateOfIssuanceException if a miic certificate of issuance with the primary key could not be found
	 */
	public MiicCertificateOfIssuance findByPrimaryKey(
			long miicCertificateOfIssuanceId)
		throws NoSuchMiicCertificateOfIssuanceException;

	/**
	 * Returns the miic certificate of issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance, or <code>null</code> if a miic certificate of issuance with the primary key could not be found
	 */
	public MiicCertificateOfIssuance fetchByPrimaryKey(
		long miicCertificateOfIssuanceId);

	/**
	 * Returns all the miic certificate of issuances.
	 *
	 * @return the miic certificate of issuances
	 */
	public java.util.List<MiicCertificateOfIssuance> findAll();

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	public java.util.List<MiicCertificateOfIssuance> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic certificate of issuances
	 */
	public java.util.List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicCertificateOfIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic certificate of issuances
	 */
	public java.util.List<MiicCertificateOfIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicCertificateOfIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic certificate of issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
	 */
	public int countAll();

}