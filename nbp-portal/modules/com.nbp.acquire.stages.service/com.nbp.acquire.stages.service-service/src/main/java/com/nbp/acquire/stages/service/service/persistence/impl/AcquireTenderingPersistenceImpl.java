/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireTenderingException;
import com.nbp.acquire.stages.service.model.AcquireTendering;
import com.nbp.acquire.stages.service.model.AcquireTenderingTable;
import com.nbp.acquire.stages.service.model.impl.AcquireTenderingImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireTenderingModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireTenderingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireTenderingUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the acquire tendering service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireTenderingPersistence.class)
public class AcquireTenderingPersistenceImpl
	extends BasePersistenceImpl<AcquireTendering>
	implements AcquireTenderingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireTenderingUtil</code> to access the acquire tendering persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireTenderingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireTenderingBy_CaseId;
	private FinderPath _finderPathCountBygetAcquireTenderingBy_CaseId;

	/**
	 * Returns the acquire tendering where caseId = &#63; or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering findBygetAcquireTenderingBy_CaseId(String caseId)
		throws NoSuchAcquireTenderingException {

		AcquireTendering acquireTendering = fetchBygetAcquireTenderingBy_CaseId(
			caseId);

		if (acquireTendering == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireTenderingException(sb.toString());
		}

		return acquireTendering;
	}

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering fetchBygetAcquireTenderingBy_CaseId(String caseId) {
		return fetchBygetAcquireTenderingBy_CaseId(caseId, true);
	}

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering fetchBygetAcquireTenderingBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireTenderingBy_CaseId, finderArgs,
				this);
		}

		if (result instanceof AcquireTendering) {
			AcquireTendering acquireTendering = (AcquireTendering)result;

			if (!Objects.equals(caseId, acquireTendering.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIRETENDERING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_2);
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

				List<AcquireTendering> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireTenderingBy_CaseId,
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
								"AcquireTenderingPersistenceImpl.fetchBygetAcquireTenderingBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireTendering acquireTendering = list.get(0);

					result = acquireTendering;

					cacheResult(acquireTendering);
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
			return (AcquireTendering)result;
		}
	}

	/**
	 * Removes the acquire tendering where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire tendering that was removed
	 */
	@Override
	public AcquireTendering removeBygetAcquireTenderingBy_CaseId(String caseId)
		throws NoSuchAcquireTenderingException {

		AcquireTendering acquireTendering = findBygetAcquireTenderingBy_CaseId(
			caseId);

		return remove(acquireTendering);
	}

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	@Override
	public int countBygetAcquireTenderingBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireTenderingBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRETENDERING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_2 =
			"acquireTendering.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIRETENDERINGBY_CASEID_CASEID_3 =
			"(acquireTendering.caseId IS NULL OR acquireTendering.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetAcquireTenderingBy_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireTenderingBy_CI;
	private FinderPath _finderPathCountBygetAcquireTenderingBy_CI;

	/**
	 * Returns all the acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId) {

		return findBygetAcquireTenderingBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of matching acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end) {

		return findBygetAcquireTenderingBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator) {

		return findBygetAcquireTenderingBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireTenderingBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireTenderingBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AcquireTendering> list = null;

		if (useFinderCache) {
			list = (List<AcquireTendering>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireTendering acquireTendering : list) {
					if (!caseId.equals(acquireTendering.getCaseId())) {
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

			sb.append(_SQL_SELECT_ACQUIRETENDERING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireTenderingModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquireTendering>)QueryUtil.list(
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
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering findBygetAcquireTenderingBy_CI_First(
			String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws NoSuchAcquireTenderingException {

		AcquireTendering acquireTendering =
			fetchBygetAcquireTenderingBy_CI_First(caseId, orderByComparator);

		if (acquireTendering != null) {
			return acquireTendering;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireTenderingException(sb.toString());
	}

	/**
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering fetchBygetAcquireTenderingBy_CI_First(
		String caseId, OrderByComparator<AcquireTendering> orderByComparator) {

		List<AcquireTendering> list = findBygetAcquireTenderingBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering findBygetAcquireTenderingBy_CI_Last(
			String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws NoSuchAcquireTenderingException {

		AcquireTendering acquireTendering =
			fetchBygetAcquireTenderingBy_CI_Last(caseId, orderByComparator);

		if (acquireTendering != null) {
			return acquireTendering;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireTenderingException(sb.toString());
	}

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	@Override
	public AcquireTendering fetchBygetAcquireTenderingBy_CI_Last(
		String caseId, OrderByComparator<AcquireTendering> orderByComparator) {

		int count = countBygetAcquireTenderingBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<AcquireTendering> list = findBygetAcquireTenderingBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire tenderings before and after the current acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param acquireTenderingId the primary key of the current acquire tendering
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering[] findBygetAcquireTenderingBy_CI_PrevAndNext(
			long acquireTenderingId, String caseId,
			OrderByComparator<AcquireTendering> orderByComparator)
		throws NoSuchAcquireTenderingException {

		caseId = Objects.toString(caseId, "");

		AcquireTendering acquireTendering = findByPrimaryKey(
			acquireTenderingId);

		Session session = null;

		try {
			session = openSession();

			AcquireTendering[] array = new AcquireTenderingImpl[3];

			array[0] = getBygetAcquireTenderingBy_CI_PrevAndNext(
				session, acquireTendering, caseId, orderByComparator, true);

			array[1] = acquireTendering;

			array[2] = getBygetAcquireTenderingBy_CI_PrevAndNext(
				session, acquireTendering, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcquireTendering getBygetAcquireTenderingBy_CI_PrevAndNext(
		Session session, AcquireTendering acquireTendering, String caseId,
		OrderByComparator<AcquireTendering> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIRETENDERING_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_2);
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
			sb.append(AcquireTenderingModelImpl.ORDER_BY_JPQL);
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
						acquireTendering)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireTendering> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire tenderings where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetAcquireTenderingBy_CI(String caseId) {
		for (AcquireTendering acquireTendering :
				findBygetAcquireTenderingBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireTendering);
		}
	}

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	@Override
	public int countBygetAcquireTenderingBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireTenderingBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRETENDERING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_2 =
			"acquireTendering.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIRETENDERINGBY_CI_CASEID_3 =
			"(acquireTendering.caseId IS NULL OR acquireTendering.caseId = '')";

	public AcquireTenderingPersistenceImpl() {
		setModelClass(AcquireTendering.class);

		setModelImplClass(AcquireTenderingImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireTenderingTable.INSTANCE);
	}

	/**
	 * Caches the acquire tendering in the entity cache if it is enabled.
	 *
	 * @param acquireTendering the acquire tendering
	 */
	@Override
	public void cacheResult(AcquireTendering acquireTendering) {
		entityCache.putResult(
			AcquireTenderingImpl.class, acquireTendering.getPrimaryKey(),
			acquireTendering);

		finderCache.putResult(
			_finderPathFetchBygetAcquireTenderingBy_CaseId,
			new Object[] {acquireTendering.getCaseId()}, acquireTendering);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire tenderings in the entity cache if it is enabled.
	 *
	 * @param acquireTenderings the acquire tenderings
	 */
	@Override
	public void cacheResult(List<AcquireTendering> acquireTenderings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireTenderings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireTendering acquireTendering : acquireTenderings) {
			if (entityCache.getResult(
					AcquireTenderingImpl.class,
					acquireTendering.getPrimaryKey()) == null) {

				cacheResult(acquireTendering);
			}
		}
	}

	/**
	 * Clears the cache for all acquire tenderings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireTenderingImpl.class);

		finderCache.clearCache(AcquireTenderingImpl.class);
	}

	/**
	 * Clears the cache for the acquire tendering.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireTendering acquireTendering) {
		entityCache.removeResult(AcquireTenderingImpl.class, acquireTendering);
	}

	@Override
	public void clearCache(List<AcquireTendering> acquireTenderings) {
		for (AcquireTendering acquireTendering : acquireTenderings) {
			entityCache.removeResult(
				AcquireTenderingImpl.class, acquireTendering);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireTenderingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireTenderingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireTenderingModelImpl acquireTenderingModelImpl) {

		Object[] args = new Object[] {acquireTenderingModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireTenderingBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireTenderingBy_CaseId, args,
			acquireTenderingModelImpl);
	}

	/**
	 * Creates a new acquire tendering with the primary key. Does not add the acquire tendering to the database.
	 *
	 * @param acquireTenderingId the primary key for the new acquire tendering
	 * @return the new acquire tendering
	 */
	@Override
	public AcquireTendering create(long acquireTenderingId) {
		AcquireTendering acquireTendering = new AcquireTenderingImpl();

		acquireTendering.setNew(true);
		acquireTendering.setPrimaryKey(acquireTenderingId);

		acquireTendering.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireTendering;
	}

	/**
	 * Removes the acquire tendering with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering that was removed
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering remove(long acquireTenderingId)
		throws NoSuchAcquireTenderingException {

		return remove((Serializable)acquireTenderingId);
	}

	/**
	 * Removes the acquire tendering with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire tendering
	 * @return the acquire tendering that was removed
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering remove(Serializable primaryKey)
		throws NoSuchAcquireTenderingException {

		Session session = null;

		try {
			session = openSession();

			AcquireTendering acquireTendering = (AcquireTendering)session.get(
				AcquireTenderingImpl.class, primaryKey);

			if (acquireTendering == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireTenderingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireTendering);
		}
		catch (NoSuchAcquireTenderingException noSuchEntityException) {
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
	protected AcquireTendering removeImpl(AcquireTendering acquireTendering) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireTendering)) {
				acquireTendering = (AcquireTendering)session.get(
					AcquireTenderingImpl.class,
					acquireTendering.getPrimaryKeyObj());
			}

			if (acquireTendering != null) {
				session.delete(acquireTendering);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireTendering != null) {
			clearCache(acquireTendering);
		}

		return acquireTendering;
	}

	@Override
	public AcquireTendering updateImpl(AcquireTendering acquireTendering) {
		boolean isNew = acquireTendering.isNew();

		if (!(acquireTendering instanceof AcquireTenderingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireTendering.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireTendering);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireTendering proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireTendering implementation " +
					acquireTendering.getClass());
		}

		AcquireTenderingModelImpl acquireTenderingModelImpl =
			(AcquireTenderingModelImpl)acquireTendering;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireTendering.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireTendering.setCreateDate(date);
			}
			else {
				acquireTendering.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireTenderingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireTendering.setModifiedDate(date);
			}
			else {
				acquireTendering.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireTendering);
			}
			else {
				acquireTendering = (AcquireTendering)session.merge(
					acquireTendering);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireTenderingImpl.class, acquireTenderingModelImpl, false, true);

		cacheUniqueFindersCache(acquireTenderingModelImpl);

		if (isNew) {
			acquireTendering.setNew(false);
		}

		acquireTendering.resetOriginalValues();

		return acquireTendering;
	}

	/**
	 * Returns the acquire tendering with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire tendering
	 * @return the acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireTenderingException {

		AcquireTendering acquireTendering = fetchByPrimaryKey(primaryKey);

		if (acquireTendering == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireTenderingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireTendering;
	}

	/**
	 * Returns the acquire tendering with the primary key or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering findByPrimaryKey(long acquireTenderingId)
		throws NoSuchAcquireTenderingException {

		return findByPrimaryKey((Serializable)acquireTenderingId);
	}

	/**
	 * Returns the acquire tendering with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering, or <code>null</code> if a acquire tendering with the primary key could not be found
	 */
	@Override
	public AcquireTendering fetchByPrimaryKey(long acquireTenderingId) {
		return fetchByPrimaryKey((Serializable)acquireTenderingId);
	}

	/**
	 * Returns all the acquire tenderings.
	 *
	 * @return the acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findAll(
		int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire tenderings
	 */
	@Override
	public List<AcquireTendering> findAll(
		int start, int end,
		OrderByComparator<AcquireTendering> orderByComparator,
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

		List<AcquireTendering> list = null;

		if (useFinderCache) {
			list = (List<AcquireTendering>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIRETENDERING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIRETENDERING;

				sql = sql.concat(AcquireTenderingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireTendering>)QueryUtil.list(
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
	 * Removes all the acquire tenderings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireTendering acquireTendering : findAll()) {
			remove(acquireTendering);
		}
	}

	/**
	 * Returns the number of acquire tenderings.
	 *
	 * @return the number of acquire tenderings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACQUIRETENDERING);

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
		return "acquireTenderingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIRETENDERING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireTenderingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire tendering persistence.
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

		_finderPathFetchBygetAcquireTenderingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireTenderingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireTenderingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireTenderingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetAcquireTenderingBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireTenderingBy_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetAcquireTenderingBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireTenderingBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetAcquireTenderingBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireTenderingBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireTenderingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireTenderingUtil.setPersistence(null);

		entityCache.removeCache(AcquireTenderingImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIRETENDERING =
		"SELECT acquireTendering FROM AcquireTendering acquireTendering";

	private static final String _SQL_SELECT_ACQUIRETENDERING_WHERE =
		"SELECT acquireTendering FROM AcquireTendering acquireTendering WHERE ";

	private static final String _SQL_COUNT_ACQUIRETENDERING =
		"SELECT COUNT(acquireTendering) FROM AcquireTendering acquireTendering";

	private static final String _SQL_COUNT_ACQUIRETENDERING_WHERE =
		"SELECT COUNT(acquireTendering) FROM AcquireTendering acquireTendering WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireTendering.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireTendering exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireTendering exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireTenderingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}