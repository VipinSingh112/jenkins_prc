/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjPaymentConfirmationException;
import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation;
import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmationTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjPaymentConfirmationPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjPaymentConfirmationUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the ncbj payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjPaymentConfirmationPersistence.class)
public class NcbjPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<NcbjPaymentConfirmation>
	implements NcbjPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjPaymentConfirmationUtil</code> to access the ncbj payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcbjPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetNcbjPaymentConfBy_CI;

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation findBygetNcbjPaymentConfBy_CI(String caseId)
		throws NoSuchNcbjPaymentConfirmationException {

		NcbjPaymentConfirmation ncbjPaymentConfirmation =
			fetchBygetNcbjPaymentConfBy_CI(caseId);

		if (ncbjPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjPaymentConfirmationException(sb.toString());
		}

		return ncbjPaymentConfirmation;
	}

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId) {

		return fetchBygetNcbjPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbjPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof NcbjPaymentConfirmation) {
			NcbjPaymentConfirmation ncbjPaymentConfirmation =
				(NcbjPaymentConfirmation)result;

			if (!Objects.equals(caseId, ncbjPaymentConfirmation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_2);
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

				List<NcbjPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbjPaymentConfBy_CI,
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
								"NcbjPaymentConfirmationPersistenceImpl.fetchBygetNcbjPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjPaymentConfirmation ncbjPaymentConfirmation = list.get(
						0);

					result = ncbjPaymentConfirmation;

					cacheResult(ncbjPaymentConfirmation);
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
			return (NcbjPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the ncbj payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj payment confirmation that was removed
	 */
	@Override
	public NcbjPaymentConfirmation removeBygetNcbjPaymentConfBy_CI(
			String caseId)
		throws NoSuchNcbjPaymentConfirmationException {

		NcbjPaymentConfirmation ncbjPaymentConfirmation =
			findBygetNcbjPaymentConfBy_CI(caseId);

		return remove(ncbjPaymentConfirmation);
	}

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	@Override
	public int countBygetNcbjPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbjPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_2 =
			"ncbjPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJPAYMENTCONFBY_CI_CASEID_3 =
			"(ncbjPaymentConfirmation.caseId IS NULL OR ncbjPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbjPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbjPayConfBy_CI;
	private FinderPath _finderPathCountBygetNcbjPayConfBy_CI;

	/**
	 * Returns all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId) {

		return findBygetNcbjPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of matching ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetNcbjPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return findBygetNcbjPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcbjPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbjPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcbjPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<NcbjPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjPaymentConfirmation ncbjPaymentConfirmation : list) {
					if (!caseId.equals(ncbjPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCBJPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_First(
			String caseId,
			OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException {

		NcbjPaymentConfirmation ncbjPaymentConfirmation =
			fetchBygetNcbjPayConfBy_CI_First(caseId, orderByComparator);

		if (ncbjPaymentConfirmation != null) {
			return ncbjPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_First(
		String caseId,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		List<NcbjPaymentConfirmation> list = findBygetNcbjPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException {

		NcbjPaymentConfirmation ncbjPaymentConfirmation =
			fetchBygetNcbjPayConfBy_CI_Last(caseId, orderByComparator);

		if (ncbjPaymentConfirmation != null) {
			return ncbjPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	@Override
	public NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		int count = countBygetNcbjPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<NcbjPaymentConfirmation> list = findBygetNcbjPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj payment confirmations before and after the current ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the current ncbj payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation[] findBygetNcbjPayConfBy_CI_PrevAndNext(
			long ncbjPaymentConfirmationId, String caseId,
			OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		NcbjPaymentConfirmation ncbjPaymentConfirmation = findByPrimaryKey(
			ncbjPaymentConfirmationId);

		Session session = null;

		try {
			session = openSession();

			NcbjPaymentConfirmation[] array =
				new NcbjPaymentConfirmationImpl[3];

			array[0] = getBygetNcbjPayConfBy_CI_PrevAndNext(
				session, ncbjPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = ncbjPaymentConfirmation;

			array[2] = getBygetNcbjPayConfBy_CI_PrevAndNext(
				session, ncbjPaymentConfirmation, caseId, orderByComparator,
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

	protected NcbjPaymentConfirmation getBygetNcbjPayConfBy_CI_PrevAndNext(
		Session session, NcbjPaymentConfirmation ncbjPaymentConfirmation,
		String caseId,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_2);
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
			sb.append(NcbjPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						ncbjPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcbjPayConfBy_CI(String caseId) {
		for (NcbjPaymentConfirmation ncbjPaymentConfirmation :
				findBygetNcbjPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	@Override
	public int countBygetNcbjPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbjPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_2 =
		"ncbjPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJPAYCONFBY_CI_CASEID_3 =
		"(ncbjPaymentConfirmation.caseId IS NULL OR ncbjPaymentConfirmation.caseId = '')";

	public NcbjPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NcbjPaymentConfirmation.class);

		setModelImplClass(NcbjPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the ncbj payment confirmation in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 */
	@Override
	public void cacheResult(NcbjPaymentConfirmation ncbjPaymentConfirmation) {
		entityCache.putResult(
			NcbjPaymentConfirmationImpl.class,
			ncbjPaymentConfirmation.getPrimaryKey(), ncbjPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetNcbjPaymentConfBy_CI,
			new Object[] {ncbjPaymentConfirmation.getCaseId()},
			ncbjPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj payment confirmations in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmations the ncbj payment confirmations
	 */
	@Override
	public void cacheResult(
		List<NcbjPaymentConfirmation> ncbjPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjPaymentConfirmation ncbjPaymentConfirmation :
				ncbjPaymentConfirmations) {

			if (entityCache.getResult(
					NcbjPaymentConfirmationImpl.class,
					ncbjPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(ncbjPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjPaymentConfirmationImpl.class);

		finderCache.clearCache(NcbjPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the ncbj payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjPaymentConfirmation ncbjPaymentConfirmation) {
		entityCache.removeResult(
			NcbjPaymentConfirmationImpl.class, ncbjPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<NcbjPaymentConfirmation> ncbjPaymentConfirmations) {

		for (NcbjPaymentConfirmation ncbjPaymentConfirmation :
				ncbjPaymentConfirmations) {

			entityCache.removeResult(
				NcbjPaymentConfirmationImpl.class, ncbjPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjPaymentConfirmationModelImpl ncbjPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			ncbjPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbjPaymentConfBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbjPaymentConfBy_CI, args,
			ncbjPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new ncbj payment confirmation with the primary key. Does not add the ncbj payment confirmation to the database.
	 *
	 * @param ncbjPaymentConfirmationId the primary key for the new ncbj payment confirmation
	 * @return the new ncbj payment confirmation
	 */
	@Override
	public NcbjPaymentConfirmation create(long ncbjPaymentConfirmationId) {
		NcbjPaymentConfirmation ncbjPaymentConfirmation =
			new NcbjPaymentConfirmationImpl();

		ncbjPaymentConfirmation.setNew(true);
		ncbjPaymentConfirmation.setPrimaryKey(ncbjPaymentConfirmationId);

		ncbjPaymentConfirmation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjPaymentConfirmation;
	}

	/**
	 * Removes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation remove(long ncbjPaymentConfirmationId)
		throws NoSuchNcbjPaymentConfirmationException {

		return remove((Serializable)ncbjPaymentConfirmationId);
	}

	/**
	 * Removes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchNcbjPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			NcbjPaymentConfirmation ncbjPaymentConfirmation =
				(NcbjPaymentConfirmation)session.get(
					NcbjPaymentConfirmationImpl.class, primaryKey);

			if (ncbjPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjPaymentConfirmation);
		}
		catch (NoSuchNcbjPaymentConfirmationException noSuchEntityException) {
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
	protected NcbjPaymentConfirmation removeImpl(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjPaymentConfirmation)) {
				ncbjPaymentConfirmation = (NcbjPaymentConfirmation)session.get(
					NcbjPaymentConfirmationImpl.class,
					ncbjPaymentConfirmation.getPrimaryKeyObj());
			}

			if (ncbjPaymentConfirmation != null) {
				session.delete(ncbjPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjPaymentConfirmation != null) {
			clearCache(ncbjPaymentConfirmation);
		}

		return ncbjPaymentConfirmation;
	}

	@Override
	public NcbjPaymentConfirmation updateImpl(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		boolean isNew = ncbjPaymentConfirmation.isNew();

		if (!(ncbjPaymentConfirmation instanceof
				NcbjPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjPaymentConfirmation implementation " +
					ncbjPaymentConfirmation.getClass());
		}

		NcbjPaymentConfirmationModelImpl ncbjPaymentConfirmationModelImpl =
			(NcbjPaymentConfirmationModelImpl)ncbjPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjPaymentConfirmation.setCreateDate(date);
			}
			else {
				ncbjPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjPaymentConfirmation.setModifiedDate(date);
			}
			else {
				ncbjPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjPaymentConfirmation);
			}
			else {
				ncbjPaymentConfirmation =
					(NcbjPaymentConfirmation)session.merge(
						ncbjPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjPaymentConfirmationImpl.class, ncbjPaymentConfirmationModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjPaymentConfirmationModelImpl);

		if (isNew) {
			ncbjPaymentConfirmation.setNew(false);
		}

		ncbjPaymentConfirmation.resetOriginalValues();

		return ncbjPaymentConfirmation;
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjPaymentConfirmationException {

		NcbjPaymentConfirmation ncbjPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (ncbjPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjPaymentConfirmation;
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation findByPrimaryKey(
			long ncbjPaymentConfirmationId)
		throws NoSuchNcbjPaymentConfirmationException {

		return findByPrimaryKey((Serializable)ncbjPaymentConfirmationId);
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation, or <code>null</code> if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public NcbjPaymentConfirmation fetchByPrimaryKey(
		long ncbjPaymentConfirmationId) {

		return fetchByPrimaryKey((Serializable)ncbjPaymentConfirmationId);
	}

	/**
	 * Returns all the ncbj payment confirmations.
	 *
	 * @return the ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj payment confirmations
	 */
	@Override
	public List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator,
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

		List<NcbjPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<NcbjPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJPAYMENTCONFIRMATION;

				sql = sql.concat(
					NcbjPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the ncbj payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjPaymentConfirmation ncbjPaymentConfirmation : findAll()) {
			remove(ncbjPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of ncbj payment confirmations.
	 *
	 * @return the number of ncbj payment confirmations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_NCBJPAYMENTCONFIRMATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "ncbjPaymentConfirmationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj payment confirmation persistence.
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

		_finderPathFetchBygetNcbjPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbjPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbjPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcbjPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbjPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcbjPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcbjPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetNcbjPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		NcbjPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(NcbjPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJPAYMENTCONFIRMATION =
		"SELECT ncbjPaymentConfirmation FROM NcbjPaymentConfirmation ncbjPaymentConfirmation";

	private static final String _SQL_SELECT_NCBJPAYMENTCONFIRMATION_WHERE =
		"SELECT ncbjPaymentConfirmation FROM NcbjPaymentConfirmation ncbjPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_NCBJPAYMENTCONFIRMATION =
		"SELECT COUNT(ncbjPaymentConfirmation) FROM NcbjPaymentConfirmation ncbjPaymentConfirmation";

	private static final String _SQL_COUNT_NCBJPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(ncbjPaymentConfirmation) FROM NcbjPaymentConfirmation ncbjPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}