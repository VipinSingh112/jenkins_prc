/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.pharmaceutical.stages.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationFullLicenseException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicenseTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationFullLicensePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationFullLicenseUtil;
import com.nbp.pharmaceutical.stages.services.service.persistence.impl.constants.PHARMA_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pharma application full license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		PharmaApplicationFullLicensePersistence.class, BasePersistence.class
	}
)
public class PharmaApplicationFullLicensePersistenceImpl
	extends BasePersistenceImpl<PharmaApplicationFullLicense>
	implements PharmaApplicationFullLicensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationFullLicenseUtil</code> to access the pharma application full license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationFullLicenseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPharmaFullLic_By_CI;
	private FinderPath _finderPathCountBygetPharmaFullLic_By_CI;

	/**
	 * Returns the pharma application full license where caseId = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CI(
			String caseId)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			fetchBygetPharmaFullLic_By_CI(caseId);

		if (pharmaApplicationFullLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationFullLicenseException(
				sb.toString());
		}

		return pharmaApplicationFullLicense;
	}

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId) {

		return fetchBygetPharmaFullLic_By_CI(caseId, true);
	}

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaFullLic_By_CI, finderArgs,this);
		}

		if (result instanceof PharmaApplicationFullLicense) {
			PharmaApplicationFullLicense pharmaApplicationFullLicense =
				(PharmaApplicationFullLicense)result;

			if (!Objects.equals(
					caseId, pharmaApplicationFullLicense.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<PharmaApplicationFullLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaFullLic_By_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"PharmaApplicationFullLicensePersistenceImpl.fetchBygetPharmaFullLic_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationFullLicense pharmaApplicationFullLicense =
						list.get(0);

					result = pharmaApplicationFullLicense;

					cacheResult(pharmaApplicationFullLicense);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PharmaApplicationFullLicense)result;
		}
	}

	/**
	 * Removes the pharma application full license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application full license that was removed
	 */
	@Override
	public PharmaApplicationFullLicense removeBygetPharmaFullLic_By_CI(
			String caseId)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			findBygetPharmaFullLic_By_CI(caseId);

		return remove(pharmaApplicationFullLicense);
	}

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	@Override
	public int countBygetPharmaFullLic_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPharmaFullLic_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_2 =
		"pharmaApplicationFullLicense.caseId = ?";

	private static final String _FINDER_COLUMN_GETPHARMAFULLLIC_BY_CI_CASEID_3 =
		"(pharmaApplicationFullLicense.caseId IS NULL OR pharmaApplicationFullLicense.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetPharmaFullLic_By_CID;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPharmaFullLic_By_CID;
	private FinderPath _finderPathCountBygetPharmaFullLic_By_CID;

	/**
	 * Returns all the pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findBygetPharmaFullLic_By_CID(
		String caseId) {

		return findBygetPharmaFullLic_By_CID(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of matching pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findBygetPharmaFullLic_By_CID(
		String caseId, int start, int end) {

		return findBygetPharmaFullLic_By_CID(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findBygetPharmaFullLic_By_CID(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return findBygetPharmaFullLic_By_CID(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findBygetPharmaFullLic_By_CID(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPharmaFullLic_By_CID;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharmaFullLic_By_CID;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<PharmaApplicationFullLicense> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationFullLicense>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationFullLicense pharmaApplicationFullLicense :
						list) {

					if (!caseId.equals(
							pharmaApplicationFullLicense.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationFullLicenseModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<PharmaApplicationFullLicense>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CID_First(
			String caseId,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			fetchBygetPharmaFullLic_By_CID_First(caseId, orderByComparator);

		if (pharmaApplicationFullLicense != null) {
			return pharmaApplicationFullLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationFullLicenseException(sb.toString());
	}

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CID_First(
		String caseId,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		List<PharmaApplicationFullLicense> list = findBygetPharmaFullLic_By_CID(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CID_Last(
			String caseId,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			fetchBygetPharmaFullLic_By_CID_Last(caseId, orderByComparator);

		if (pharmaApplicationFullLicense != null) {
			return pharmaApplicationFullLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationFullLicenseException(sb.toString());
	}

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CID_Last(
		String caseId,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		int count = countBygetPharmaFullLic_By_CID(caseId);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationFullLicense> list = findBygetPharmaFullLic_By_CID(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application full licenses before and after the current pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaFullLicenseId the primary key of the current pharma application full license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense[]
			findBygetPharmaFullLic_By_CID_PrevAndNext(
				long pharmaFullLicenseId, String caseId,
				OrderByComparator<PharmaApplicationFullLicense>
					orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException {

		caseId = Objects.toString(caseId, "");

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			findByPrimaryKey(pharmaFullLicenseId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationFullLicense[] array =
				new PharmaApplicationFullLicenseImpl[3];

			array[0] = getBygetPharmaFullLic_By_CID_PrevAndNext(
				session, pharmaApplicationFullLicense, caseId,
				orderByComparator, true);

			array[1] = pharmaApplicationFullLicense;

			array[2] = getBygetPharmaFullLic_By_CID_PrevAndNext(
				session, pharmaApplicationFullLicense, caseId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaApplicationFullLicense
		getBygetPharmaFullLic_By_CID_PrevAndNext(
			Session session,
			PharmaApplicationFullLicense pharmaApplicationFullLicense,
			String caseId,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PharmaApplicationFullLicenseModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaApplicationFullLicense)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationFullLicense> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application full licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPharmaFullLic_By_CID(String caseId) {
		for (PharmaApplicationFullLicense pharmaApplicationFullLicense :
				findBygetPharmaFullLic_By_CID(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationFullLicense);
		}
	}

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	@Override
	public int countBygetPharmaFullLic_By_CID(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPharmaFullLic_By_CID;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_2 =
			"pharmaApplicationFullLicense.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMAFULLLIC_BY_CID_CASEID_3 =
			"(pharmaApplicationFullLicense.caseId IS NULL OR pharmaApplicationFullLicense.caseId = '')";

	private FinderPath _finderPathFetchBygetPharmaFullLic_By_LN;
	private FinderPath _finderPathCountBygetPharmaFullLic_By_LN;

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			fetchBygetPharmaFullLic_By_LN(licenseNumber);

		if (pharmaApplicationFullLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("licenseNumber=");
			sb.append(licenseNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationFullLicenseException(
				sb.toString());
		}

		return pharmaApplicationFullLicense;
	}

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber) {

		return fetchBygetPharmaFullLic_By_LN(licenseNumber, true);
	}

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber, boolean useFinderCache) {

		licenseNumber = Objects.toString(licenseNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {licenseNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaFullLic_By_LN, finderArgs,this);
		}

		if (result instanceof PharmaApplicationFullLicense) {
			PharmaApplicationFullLicense pharmaApplicationFullLicense =
				(PharmaApplicationFullLicense)result;

			if (!Objects.equals(
					licenseNumber,
					pharmaApplicationFullLicense.getLicenseNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
				}

				List<PharmaApplicationFullLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaFullLic_By_LN,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {licenseNumber};
							}

							_log.warn(
								"PharmaApplicationFullLicensePersistenceImpl.fetchBygetPharmaFullLic_By_LN(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationFullLicense pharmaApplicationFullLicense =
						list.get(0);

					result = pharmaApplicationFullLicense;

					cacheResult(pharmaApplicationFullLicense);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (PharmaApplicationFullLicense)result;
		}
	}

	/**
	 * Removes the pharma application full license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the pharma application full license that was removed
	 */
	@Override
	public PharmaApplicationFullLicense removeBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			findBygetPharmaFullLic_By_LN(licenseNumber);

		return remove(pharmaApplicationFullLicense);
	}

	/**
	 * Returns the number of pharma application full licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching pharma application full licenses
	 */
	@Override
	public int countBygetPharmaFullLic_By_LN(String licenseNumber) {
		licenseNumber = Objects.toString(licenseNumber, "");

		FinderPath finderPath = _finderPathCountBygetPharmaFullLic_By_LN;

		Object[] finderArgs = new Object[] {licenseNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_2 =
			"pharmaApplicationFullLicense.licenseNumber = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMAFULLLIC_BY_LN_LICENSENUMBER_3 =
			"(pharmaApplicationFullLicense.licenseNumber IS NULL OR pharmaApplicationFullLicense.licenseNumber = '')";

	public PharmaApplicationFullLicensePersistenceImpl() {
		setModelClass(PharmaApplicationFullLicense.class);

		setModelImplClass(PharmaApplicationFullLicenseImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationFullLicenseTable.INSTANCE);
	}

	/**
	 * Caches the pharma application full license in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 */
	@Override
	public void cacheResult(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		entityCache.putResult(
			PharmaApplicationFullLicenseImpl.class,
			pharmaApplicationFullLicense.getPrimaryKey(),
			pharmaApplicationFullLicense);

		finderCache.putResult(
			_finderPathFetchBygetPharmaFullLic_By_CI,
			new Object[] {pharmaApplicationFullLicense.getCaseId()},
			pharmaApplicationFullLicense);

		finderCache.putResult(
			_finderPathFetchBygetPharmaFullLic_By_LN,
			new Object[] {pharmaApplicationFullLicense.getLicenseNumber()},
			pharmaApplicationFullLicense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma application full licenses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicenses the pharma application full licenses
	 */
	@Override
	public void cacheResult(
		List<PharmaApplicationFullLicense> pharmaApplicationFullLicenses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplicationFullLicenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplicationFullLicense pharmaApplicationFullLicense :
				pharmaApplicationFullLicenses) {

			if (entityCache.getResult(
					PharmaApplicationFullLicenseImpl.class,
					pharmaApplicationFullLicense.getPrimaryKey()) == null) {

				cacheResult(pharmaApplicationFullLicense);
			}
		}
	}

	/**
	 * Clears the cache for all pharma application full licenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationFullLicenseImpl.class);

		finderCache.clearCache(PharmaApplicationFullLicenseImpl.class);
	}

	/**
	 * Clears the cache for the pharma application full license.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		entityCache.removeResult(
			PharmaApplicationFullLicenseImpl.class,
			pharmaApplicationFullLicense);
	}

	@Override
	public void clearCache(
		List<PharmaApplicationFullLicense> pharmaApplicationFullLicenses) {

		for (PharmaApplicationFullLicense pharmaApplicationFullLicense :
				pharmaApplicationFullLicenses) {

			entityCache.removeResult(
				PharmaApplicationFullLicenseImpl.class,
				pharmaApplicationFullLicense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationFullLicenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaApplicationFullLicenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationFullLicenseModelImpl
			pharmaApplicationFullLicenseModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationFullLicenseModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaFullLic_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaFullLic_By_CI, args,
			pharmaApplicationFullLicenseModelImpl);

		args = new Object[] {
			pharmaApplicationFullLicenseModelImpl.getLicenseNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaFullLic_By_LN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaFullLic_By_LN, args,
			pharmaApplicationFullLicenseModelImpl);
	}

	/**
	 * Creates a new pharma application full license with the primary key. Does not add the pharma application full license to the database.
	 *
	 * @param pharmaFullLicenseId the primary key for the new pharma application full license
	 * @return the new pharma application full license
	 */
	@Override
	public PharmaApplicationFullLicense create(long pharmaFullLicenseId) {
		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			new PharmaApplicationFullLicenseImpl();

		pharmaApplicationFullLicense.setNew(true);
		pharmaApplicationFullLicense.setPrimaryKey(pharmaFullLicenseId);

		pharmaApplicationFullLicense.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pharmaApplicationFullLicense;
	}

	/**
	 * Removes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense remove(long pharmaFullLicenseId)
		throws NoSuchPharmaApplicationFullLicenseException {

		return remove((Serializable)pharmaFullLicenseId);
	}

	/**
	 * Removes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationFullLicenseException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationFullLicense pharmaApplicationFullLicense =
				(PharmaApplicationFullLicense)session.get(
					PharmaApplicationFullLicenseImpl.class, primaryKey);

			if (pharmaApplicationFullLicense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationFullLicenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplicationFullLicense);
		}
		catch (NoSuchPharmaApplicationFullLicenseException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected PharmaApplicationFullLicense removeImpl(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplicationFullLicense)) {
				pharmaApplicationFullLicense =
					(PharmaApplicationFullLicense)session.get(
						PharmaApplicationFullLicenseImpl.class,
						pharmaApplicationFullLicense.getPrimaryKeyObj());
			}

			if (pharmaApplicationFullLicense != null) {
				session.delete(pharmaApplicationFullLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplicationFullLicense != null) {
			clearCache(pharmaApplicationFullLicense);
		}

		return pharmaApplicationFullLicense;
	}

	@Override
	public PharmaApplicationFullLicense updateImpl(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		boolean isNew = pharmaApplicationFullLicense.isNew();

		if (!(pharmaApplicationFullLicense instanceof
				PharmaApplicationFullLicenseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					pharmaApplicationFullLicense.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplicationFullLicense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplicationFullLicense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplicationFullLicense implementation " +
					pharmaApplicationFullLicense.getClass());
		}

		PharmaApplicationFullLicenseModelImpl
			pharmaApplicationFullLicenseModelImpl =
				(PharmaApplicationFullLicenseModelImpl)
					pharmaApplicationFullLicense;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaApplicationFullLicense.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaApplicationFullLicense.setCreateDate(date);
			}
			else {
				pharmaApplicationFullLicense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationFullLicenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplicationFullLicense.setModifiedDate(date);
			}
			else {
				pharmaApplicationFullLicense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplicationFullLicense);
			}
			else {
				pharmaApplicationFullLicense =
					(PharmaApplicationFullLicense)session.merge(
						pharmaApplicationFullLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationFullLicenseImpl.class,
			pharmaApplicationFullLicenseModelImpl, false, true);

		cacheUniqueFindersCache(pharmaApplicationFullLicenseModelImpl);

		if (isNew) {
			pharmaApplicationFullLicense.setNew(false);
		}

		pharmaApplicationFullLicense.resetOriginalValues();

		return pharmaApplicationFullLicense;
	}

	/**
	 * Returns the pharma application full license with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchPharmaApplicationFullLicenseException {

		PharmaApplicationFullLicense pharmaApplicationFullLicense =
			fetchByPrimaryKey(primaryKey);

		if (pharmaApplicationFullLicense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationFullLicenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplicationFullLicense;
	}

	/**
	 * Returns the pharma application full license with the primary key or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense findByPrimaryKey(
			long pharmaFullLicenseId)
		throws NoSuchPharmaApplicationFullLicenseException {

		return findByPrimaryKey((Serializable)pharmaFullLicenseId);
	}

	/**
	 * Returns the pharma application full license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license, or <code>null</code> if a pharma application full license with the primary key could not be found
	 */
	@Override
	public PharmaApplicationFullLicense fetchByPrimaryKey(
		long pharmaFullLicenseId) {

		return fetchByPrimaryKey((Serializable)pharmaFullLicenseId);
	}

	/**
	 * Returns all the pharma application full licenses.
	 *
	 * @return the pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application full licenses
	 */
	@Override
	public List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<PharmaApplicationFullLicense> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationFullLicense>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE;

				sql = sql.concat(
					PharmaApplicationFullLicenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplicationFullLicense>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pharma application full licenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplicationFullLicense pharmaApplicationFullLicense :
				findAll()) {

			remove(pharmaApplicationFullLicense);
		}
	}

	/**
	 * Returns the number of pharma application full licenses.
	 *
	 * @return the number of pharma application full licenses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "pharmaFullLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationFullLicenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application full license persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetPharmaFullLic_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaFullLic_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPharmaFullLic_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaFullLic_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPharmaFullLic_By_CID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetPharmaFullLic_By_CID",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPharmaFullLic_By_CID =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPharmaFullLic_By_CID",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetPharmaFullLic_By_CID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaFullLic_By_CID",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetPharmaFullLic_By_LN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaFullLic_By_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, true);

		_finderPathCountBygetPharmaFullLic_By_LN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaFullLic_By_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, false);

		_setPharmaApplicationFullLicenseUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPharmaApplicationFullLicenseUtilPersistence(null);

		entityCache.removeCache(
			PharmaApplicationFullLicenseImpl.class.getName());
	}

	private void _setPharmaApplicationFullLicenseUtilPersistence(
		PharmaApplicationFullLicensePersistence
			pharmaApplicationFullLicensePersistence) {

		try {
			Field field =
				PharmaApplicationFullLicenseUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, pharmaApplicationFullLicensePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE =
		"SELECT pharmaApplicationFullLicense FROM PharmaApplicationFullLicense pharmaApplicationFullLicense";

	private static final String _SQL_SELECT_PHARMAAPPLICATIONFULLLICENSE_WHERE =
		"SELECT pharmaApplicationFullLicense FROM PharmaApplicationFullLicense pharmaApplicationFullLicense WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE =
		"SELECT COUNT(pharmaApplicationFullLicense) FROM PharmaApplicationFullLicense pharmaApplicationFullLicense";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONFULLLICENSE_WHERE =
		"SELECT COUNT(pharmaApplicationFullLicense) FROM PharmaApplicationFullLicense pharmaApplicationFullLicense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaApplicationFullLicense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplicationFullLicense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplicationFullLicense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationFullLicensePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PharmaApplicationFullLicenseModelArgumentsResolver
		_pharmaApplicationFullLicenseModelArgumentsResolver;

}