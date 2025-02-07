/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence.impl;

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

import com.nbp.agriculture.stages.services.exception.NoSuchAgriculturePermitException;
import com.nbp.agriculture.stages.services.model.AgriculturePermit;
import com.nbp.agriculture.stages.services.model.AgriculturePermitTable;
import com.nbp.agriculture.stages.services.model.impl.AgriculturePermitImpl;
import com.nbp.agriculture.stages.services.model.impl.AgriculturePermitModelImpl;
import com.nbp.agriculture.stages.services.service.persistence.AgriculturePermitPersistence;
import com.nbp.agriculture.stages.services.service.persistence.AgriculturePermitUtil;
import com.nbp.agriculture.stages.services.service.persistence.impl.constants.NBP_AGRIPersistenceConstants;

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
 * The persistence implementation for the agriculture permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgriculturePermitPersistence.class)
public class AgriculturePermitPersistenceImpl
	extends BasePersistenceImpl<AgriculturePermit>
	implements AgriculturePermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgriculturePermitUtil</code> to access the agriculture permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgriculturePermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgriculturePermitBy_CI;
	private FinderPath _finderPathCountBygetAgriculturePermitBy_CI;

	/**
	 * Returns the agriculture permit where caseId = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit findBygetAgriculturePermitBy_CI(String caseId)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit = fetchBygetAgriculturePermitBy_CI(
			caseId);

		if (agriculturePermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriculturePermitException(sb.toString());
		}

		return agriculturePermit;
	}

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_CI(String caseId) {
		return fetchBygetAgriculturePermitBy_CI(caseId, true);
	}

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgriculturePermitBy_CI, finderArgs, this);
		}

		if (result instanceof AgriculturePermit) {
			AgriculturePermit agriculturePermit = (AgriculturePermit)result;

			if (!Objects.equals(caseId, agriculturePermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_2);
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

				List<AgriculturePermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgriculturePermitBy_CI,
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
								"AgriculturePermitPersistenceImpl.fetchBygetAgriculturePermitBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriculturePermit agriculturePermit = list.get(0);

					result = agriculturePermit;

					cacheResult(agriculturePermit);
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
			return (AgriculturePermit)result;
		}
	}

	/**
	 * Removes the agriculture permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture permit that was removed
	 */
	@Override
	public AgriculturePermit removeBygetAgriculturePermitBy_CI(String caseId)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit = findBygetAgriculturePermitBy_CI(
			caseId);

		return remove(agriculturePermit);
	}

	/**
	 * Returns the number of agriculture permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture permits
	 */
	@Override
	public int countBygetAgriculturePermitBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAgriculturePermitBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_2 =
			"agriculturePermit.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_CI_CASEID_3 =
			"(agriculturePermit.caseId IS NULL OR agriculturePermit.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetAgriculturePermitBy_PN;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAgriculturePermitBy_PN;
	private FinderPath _finderPathCountBygetAgriculturePermitBy_PN;

	/**
	 * Returns all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber) {

		return findBygetAgriculturePermitBy_PN(
			pirPermtNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of matching agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end) {

		return findBygetAgriculturePermitBy_PN(
			pirPermtNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return findBygetAgriculturePermitBy_PN(
			pirPermtNumber, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator,
		boolean useFinderCache) {

		pirPermtNumber = Objects.toString(pirPermtNumber, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAgriculturePermitBy_PN;
				finderArgs = new Object[] {pirPermtNumber};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAgriculturePermitBy_PN;
			finderArgs = new Object[] {
				pirPermtNumber, start, end, orderByComparator
			};
		}

		List<AgriculturePermit> list = null;

		if (useFinderCache) {
			list = (List<AgriculturePermit>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgriculturePermit agriculturePermit : list) {
					if (!pirPermtNumber.equals(
							agriculturePermit.getPirPermtNumber())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREPERMIT_WHERE);

			boolean bindPirPermtNumber = false;

			if (pirPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_3);
			}
			else {
				bindPirPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgriculturePermitModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPirPermtNumber) {
					queryPos.add(pirPermtNumber);
				}

				list = (List<AgriculturePermit>)QueryUtil.list(
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
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit findBygetAgriculturePermitBy_PN_First(
			String pirPermtNumber,
			OrderByComparator<AgriculturePermit> orderByComparator)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit =
			fetchBygetAgriculturePermitBy_PN_First(
				pirPermtNumber, orderByComparator);

		if (agriculturePermit != null) {
			return agriculturePermit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pirPermtNumber=");
		sb.append(pirPermtNumber);

		sb.append("}");

		throw new NoSuchAgriculturePermitException(sb.toString());
	}

	/**
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_PN_First(
		String pirPermtNumber,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		List<AgriculturePermit> list = findBygetAgriculturePermitBy_PN(
			pirPermtNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit findBygetAgriculturePermitBy_PN_Last(
			String pirPermtNumber,
			OrderByComparator<AgriculturePermit> orderByComparator)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit =
			fetchBygetAgriculturePermitBy_PN_Last(
				pirPermtNumber, orderByComparator);

		if (agriculturePermit != null) {
			return agriculturePermit;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pirPermtNumber=");
		sb.append(pirPermtNumber);

		sb.append("}");

		throw new NoSuchAgriculturePermitException(sb.toString());
	}

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_PN_Last(
		String pirPermtNumber,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		int count = countBygetAgriculturePermitBy_PN(pirPermtNumber);

		if (count == 0) {
			return null;
		}

		List<AgriculturePermit> list = findBygetAgriculturePermitBy_PN(
			pirPermtNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture permits before and after the current agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param agriculturePermitId the primary key of the current agriculture permit
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit[] findBygetAgriculturePermitBy_PN_PrevAndNext(
			long agriculturePermitId, String pirPermtNumber,
			OrderByComparator<AgriculturePermit> orderByComparator)
		throws NoSuchAgriculturePermitException {

		pirPermtNumber = Objects.toString(pirPermtNumber, "");

		AgriculturePermit agriculturePermit = findByPrimaryKey(
			agriculturePermitId);

		Session session = null;

		try {
			session = openSession();

			AgriculturePermit[] array = new AgriculturePermitImpl[3];

			array[0] = getBygetAgriculturePermitBy_PN_PrevAndNext(
				session, agriculturePermit, pirPermtNumber, orderByComparator,
				true);

			array[1] = agriculturePermit;

			array[2] = getBygetAgriculturePermitBy_PN_PrevAndNext(
				session, agriculturePermit, pirPermtNumber, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AgriculturePermit getBygetAgriculturePermitBy_PN_PrevAndNext(
		Session session, AgriculturePermit agriculturePermit,
		String pirPermtNumber,
		OrderByComparator<AgriculturePermit> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREPERMIT_WHERE);

		boolean bindPirPermtNumber = false;

		if (pirPermtNumber.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_3);
		}
		else {
			bindPirPermtNumber = true;

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_2);
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
			sb.append(AgriculturePermitModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPirPermtNumber) {
			queryPos.add(pirPermtNumber);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agriculturePermit)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgriculturePermit> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture permits where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 */
	@Override
	public void removeBygetAgriculturePermitBy_PN(String pirPermtNumber) {
		for (AgriculturePermit agriculturePermit :
				findBygetAgriculturePermitBy_PN(
					pirPermtNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(agriculturePermit);
		}
	}

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	@Override
	public int countBygetAgriculturePermitBy_PN(String pirPermtNumber) {
		pirPermtNumber = Objects.toString(pirPermtNumber, "");

		FinderPath finderPath = _finderPathCountBygetAgriculturePermitBy_PN;

		Object[] finderArgs = new Object[] {pirPermtNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREPERMIT_WHERE);

			boolean bindPirPermtNumber = false;

			if (pirPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_3);
			}
			else {
				bindPirPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPirPermtNumber) {
					queryPos.add(pirPermtNumber);
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
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_2 =
			"agriculturePermit.pirPermtNumber = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PN_PIRPERMTNUMBER_3 =
			"(agriculturePermit.pirPermtNumber IS NULL OR agriculturePermit.pirPermtNumber = '')";

	private FinderPath _finderPathFetchBygetAgriculturePermitBy_PermitNum;
	private FinderPath _finderPathCountBygetAgriculturePermitBy_PermitNum;

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit findBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit =
			fetchBygetAgriculturePermitBy_PermitNum(pirPermtNumber);

		if (agriculturePermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pirPermtNumber=");
			sb.append(pirPermtNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriculturePermitException(sb.toString());
		}

		return agriculturePermit;
	}

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber) {

		return fetchBygetAgriculturePermitBy_PermitNum(pirPermtNumber, true);
	}

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	@Override
	public AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber, boolean useFinderCache) {

		pirPermtNumber = Objects.toString(pirPermtNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pirPermtNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgriculturePermitBy_PermitNum, finderArgs,
				this);
		}

		if (result instanceof AgriculturePermit) {
			AgriculturePermit agriculturePermit = (AgriculturePermit)result;

			if (!Objects.equals(
					pirPermtNumber, agriculturePermit.getPirPermtNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREPERMIT_WHERE);

			boolean bindPirPermtNumber = false;

			if (pirPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_3);
			}
			else {
				bindPirPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPirPermtNumber) {
					queryPos.add(pirPermtNumber);
				}

				List<AgriculturePermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgriculturePermitBy_PermitNum,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pirPermtNumber};
							}

							_log.warn(
								"AgriculturePermitPersistenceImpl.fetchBygetAgriculturePermitBy_PermitNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriculturePermit agriculturePermit = list.get(0);

					result = agriculturePermit;

					cacheResult(agriculturePermit);
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
			return (AgriculturePermit)result;
		}
	}

	/**
	 * Removes the agriculture permit where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the agriculture permit that was removed
	 */
	@Override
	public AgriculturePermit removeBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit =
			findBygetAgriculturePermitBy_PermitNum(pirPermtNumber);

		return remove(agriculturePermit);
	}

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	@Override
	public int countBygetAgriculturePermitBy_PermitNum(String pirPermtNumber) {
		pirPermtNumber = Objects.toString(pirPermtNumber, "");

		FinderPath finderPath =
			_finderPathCountBygetAgriculturePermitBy_PermitNum;

		Object[] finderArgs = new Object[] {pirPermtNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREPERMIT_WHERE);

			boolean bindPirPermtNumber = false;

			if (pirPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_3);
			}
			else {
				bindPirPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPirPermtNumber) {
					queryPos.add(pirPermtNumber);
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
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_2 =
			"agriculturePermit.pirPermtNumber = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREPERMITBY_PERMITNUM_PIRPERMTNUMBER_3 =
			"(agriculturePermit.pirPermtNumber IS NULL OR agriculturePermit.pirPermtNumber = '')";

	public AgriculturePermitPersistenceImpl() {
		setModelClass(AgriculturePermit.class);

		setModelImplClass(AgriculturePermitImpl.class);
		setModelPKClass(long.class);

		setTable(AgriculturePermitTable.INSTANCE);
	}

	/**
	 * Caches the agriculture permit in the entity cache if it is enabled.
	 *
	 * @param agriculturePermit the agriculture permit
	 */
	@Override
	public void cacheResult(AgriculturePermit agriculturePermit) {
		entityCache.putResult(
			AgriculturePermitImpl.class, agriculturePermit.getPrimaryKey(),
			agriculturePermit);

		finderCache.putResult(
			_finderPathFetchBygetAgriculturePermitBy_CI,
			new Object[] {agriculturePermit.getCaseId()}, agriculturePermit);

		finderCache.putResult(
			_finderPathFetchBygetAgriculturePermitBy_PermitNum,
			new Object[] {agriculturePermit.getPirPermtNumber()},
			agriculturePermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture permits in the entity cache if it is enabled.
	 *
	 * @param agriculturePermits the agriculture permits
	 */
	@Override
	public void cacheResult(List<AgriculturePermit> agriculturePermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agriculturePermits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgriculturePermit agriculturePermit : agriculturePermits) {
			if (entityCache.getResult(
					AgriculturePermitImpl.class,
					agriculturePermit.getPrimaryKey()) == null) {

				cacheResult(agriculturePermit);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgriculturePermitImpl.class);

		finderCache.clearCache(AgriculturePermitImpl.class);
	}

	/**
	 * Clears the cache for the agriculture permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgriculturePermit agriculturePermit) {
		entityCache.removeResult(
			AgriculturePermitImpl.class, agriculturePermit);
	}

	@Override
	public void clearCache(List<AgriculturePermit> agriculturePermits) {
		for (AgriculturePermit agriculturePermit : agriculturePermits) {
			entityCache.removeResult(
				AgriculturePermitImpl.class, agriculturePermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgriculturePermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgriculturePermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgriculturePermitModelImpl agriculturePermitModelImpl) {

		Object[] args = new Object[] {agriculturePermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAgriculturePermitBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgriculturePermitBy_CI, args,
			agriculturePermitModelImpl);

		args = new Object[] {agriculturePermitModelImpl.getPirPermtNumber()};

		finderCache.putResult(
			_finderPathCountBygetAgriculturePermitBy_PermitNum, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgriculturePermitBy_PermitNum, args,
			agriculturePermitModelImpl);
	}

	/**
	 * Creates a new agriculture permit with the primary key. Does not add the agriculture permit to the database.
	 *
	 * @param agriculturePermitId the primary key for the new agriculture permit
	 * @return the new agriculture permit
	 */
	@Override
	public AgriculturePermit create(long agriculturePermitId) {
		AgriculturePermit agriculturePermit = new AgriculturePermitImpl();

		agriculturePermit.setNew(true);
		agriculturePermit.setPrimaryKey(agriculturePermitId);

		agriculturePermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agriculturePermit;
	}

	/**
	 * Removes the agriculture permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit that was removed
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit remove(long agriculturePermitId)
		throws NoSuchAgriculturePermitException {

		return remove((Serializable)agriculturePermitId);
	}

	/**
	 * Removes the agriculture permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture permit
	 * @return the agriculture permit that was removed
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit remove(Serializable primaryKey)
		throws NoSuchAgriculturePermitException {

		Session session = null;

		try {
			session = openSession();

			AgriculturePermit agriculturePermit =
				(AgriculturePermit)session.get(
					AgriculturePermitImpl.class, primaryKey);

			if (agriculturePermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgriculturePermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agriculturePermit);
		}
		catch (NoSuchAgriculturePermitException noSuchEntityException) {
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
	protected AgriculturePermit removeImpl(
		AgriculturePermit agriculturePermit) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agriculturePermit)) {
				agriculturePermit = (AgriculturePermit)session.get(
					AgriculturePermitImpl.class,
					agriculturePermit.getPrimaryKeyObj());
			}

			if (agriculturePermit != null) {
				session.delete(agriculturePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agriculturePermit != null) {
			clearCache(agriculturePermit);
		}

		return agriculturePermit;
	}

	@Override
	public AgriculturePermit updateImpl(AgriculturePermit agriculturePermit) {
		boolean isNew = agriculturePermit.isNew();

		if (!(agriculturePermit instanceof AgriculturePermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agriculturePermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agriculturePermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agriculturePermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgriculturePermit implementation " +
					agriculturePermit.getClass());
		}

		AgriculturePermitModelImpl agriculturePermitModelImpl =
			(AgriculturePermitModelImpl)agriculturePermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agriculturePermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				agriculturePermit.setCreateDate(date);
			}
			else {
				agriculturePermit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agriculturePermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agriculturePermit.setModifiedDate(date);
			}
			else {
				agriculturePermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agriculturePermit);
			}
			else {
				agriculturePermit = (AgriculturePermit)session.merge(
					agriculturePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgriculturePermitImpl.class, agriculturePermitModelImpl, false,
			true);

		cacheUniqueFindersCache(agriculturePermitModelImpl);

		if (isNew) {
			agriculturePermit.setNew(false);
		}

		agriculturePermit.resetOriginalValues();

		return agriculturePermit;
	}

	/**
	 * Returns the agriculture permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture permit
	 * @return the agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgriculturePermitException {

		AgriculturePermit agriculturePermit = fetchByPrimaryKey(primaryKey);

		if (agriculturePermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgriculturePermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agriculturePermit;
	}

	/**
	 * Returns the agriculture permit with the primary key or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit findByPrimaryKey(long agriculturePermitId)
		throws NoSuchAgriculturePermitException {

		return findByPrimaryKey((Serializable)agriculturePermitId);
	}

	/**
	 * Returns the agriculture permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit, or <code>null</code> if a agriculture permit with the primary key could not be found
	 */
	@Override
	public AgriculturePermit fetchByPrimaryKey(long agriculturePermitId) {
		return fetchByPrimaryKey((Serializable)agriculturePermitId);
	}

	/**
	 * Returns all the agriculture permits.
	 *
	 * @return the agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findAll(
		int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture permits
	 */
	@Override
	public List<AgriculturePermit> findAll(
		int start, int end,
		OrderByComparator<AgriculturePermit> orderByComparator,
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

		List<AgriculturePermit> list = null;

		if (useFinderCache) {
			list = (List<AgriculturePermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREPERMIT;

				sql = sql.concat(AgriculturePermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgriculturePermit>)QueryUtil.list(
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
	 * Removes all the agriculture permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgriculturePermit agriculturePermit : findAll()) {
			remove(agriculturePermit);
		}
	}

	/**
	 * Returns the number of agriculture permits.
	 *
	 * @return the number of agriculture permits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_AGRICULTUREPERMIT);

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
		return "agriculturePermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgriculturePermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture permit persistence.
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

		_finderPathFetchBygetAgriculturePermitBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgriculturePermitBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAgriculturePermitBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgriculturePermitBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetAgriculturePermitBy_PN =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAgriculturePermitBy_PN",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"pirPermtNumber"}, true);

		_finderPathWithoutPaginationFindBygetAgriculturePermitBy_PN =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAgriculturePermitBy_PN",
				new String[] {String.class.getName()},
				new String[] {"pirPermtNumber"}, true);

		_finderPathCountBygetAgriculturePermitBy_PN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgriculturePermitBy_PN",
			new String[] {String.class.getName()},
			new String[] {"pirPermtNumber"}, false);

		_finderPathFetchBygetAgriculturePermitBy_PermitNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgriculturePermitBy_PermitNum",
			new String[] {String.class.getName()},
			new String[] {"pirPermtNumber"}, true);

		_finderPathCountBygetAgriculturePermitBy_PermitNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgriculturePermitBy_PermitNum",
			new String[] {String.class.getName()},
			new String[] {"pirPermtNumber"}, false);

		AgriculturePermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgriculturePermitUtil.setPersistence(null);

		entityCache.removeCache(AgriculturePermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRICULTUREPERMIT =
		"SELECT agriculturePermit FROM AgriculturePermit agriculturePermit";

	private static final String _SQL_SELECT_AGRICULTUREPERMIT_WHERE =
		"SELECT agriculturePermit FROM AgriculturePermit agriculturePermit WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREPERMIT =
		"SELECT COUNT(agriculturePermit) FROM AgriculturePermit agriculturePermit";

	private static final String _SQL_COUNT_AGRICULTUREPERMIT_WHERE =
		"SELECT COUNT(agriculturePermit) FROM AgriculturePermit agriculturePermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agriculturePermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgriculturePermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgriculturePermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgriculturePermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}