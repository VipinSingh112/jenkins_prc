/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesCerticateOfRegisException;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories certicate of regis service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegisUtil
 * @generated
 */
@ProviderType
public interface FactoriesCerticateOfRegisPersistence
	extends BasePersistence<FactoriesCerticateOfRegis> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesCerticateOfRegisUtil} to access the factories certicate of regis persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId);

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factories certicate of regis where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories certicate of regis that was removed
	 */
	public FactoriesCerticateOfRegis removeBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	public int countBygetFactoryCertifiResgiBy_CI(String caseId);

	/**
	 * Returns all the factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(String caseId);

	/**
	 * Returns a range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of matching factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesCerticateOfRegis> orderByComparator);

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis>
		findBygetFactoryCertifiResgisBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesCerticateOfRegis> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgisBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgisBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesCerticateOfRegis> orderByComparator);

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgisBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgisBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesCerticateOfRegis> orderByComparator);

	/**
	 * Returns the factories certicate of regises before and after the current factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the current factories certicate of regis
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public FactoriesCerticateOfRegis[]
			findBygetFactoryCertifiResgisBy_CI_PrevAndNext(
				long factoriesCerticateOfRegisId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Removes all the factories certicate of regises where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFactoryCertifiResgisBy_CI(String caseId);

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	public int countBygetFactoryCertifiResgisBy_CI(String caseId);

	/**
	 * Caches the factories certicate of regis in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 */
	public void cacheResult(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis);

	/**
	 * Caches the factories certicate of regises in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegises the factories certicate of regises
	 */
	public void cacheResult(
		java.util.List<FactoriesCerticateOfRegis> factoriesCerticateOfRegises);

	/**
	 * Creates a new factories certicate of regis with the primary key. Does not add the factories certicate of regis to the database.
	 *
	 * @param factoriesCerticateOfRegisId the primary key for the new factories certicate of regis
	 * @return the new factories certicate of regis
	 */
	public FactoriesCerticateOfRegis create(long factoriesCerticateOfRegisId);

	/**
	 * Removes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public FactoriesCerticateOfRegis remove(long factoriesCerticateOfRegisId)
		throws NoSuchFactoriesCerticateOfRegisException;

	public FactoriesCerticateOfRegis updateImpl(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis);

	/**
	 * Returns the factories certicate of regis with the primary key or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	public FactoriesCerticateOfRegis findByPrimaryKey(
			long factoriesCerticateOfRegisId)
		throws NoSuchFactoriesCerticateOfRegisException;

	/**
	 * Returns the factories certicate of regis with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis, or <code>null</code> if a factories certicate of regis with the primary key could not be found
	 */
	public FactoriesCerticateOfRegis fetchByPrimaryKey(
		long factoriesCerticateOfRegisId);

	/**
	 * Returns all the factories certicate of regises.
	 *
	 * @return the factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis> findAll();

	/**
	 * Returns a range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesCerticateOfRegis> orderByComparator);

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories certicate of regises
	 */
	public java.util.List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesCerticateOfRegis> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories certicate of regises from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories certicate of regises.
	 *
	 * @return the number of factories certicate of regises
	 */
	public int countAll();

}