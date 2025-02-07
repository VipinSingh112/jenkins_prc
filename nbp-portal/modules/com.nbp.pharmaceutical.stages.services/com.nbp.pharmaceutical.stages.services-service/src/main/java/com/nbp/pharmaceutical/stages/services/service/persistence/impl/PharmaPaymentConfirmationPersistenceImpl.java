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

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaPaymentConfirmationException;
import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;
import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmationTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaPaymentConfirmationPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaPaymentConfirmationUtil;
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
 * The persistence implementation for the pharma payment confirmation service.
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
		PharmaPaymentConfirmationPersistence.class, BasePersistence.class
	}
)
public class PharmaPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<PharmaPaymentConfirmation>
	implements PharmaPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaPaymentConfirmationUtil</code> to access the pharma payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmationBy_CI;

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchPharmaPaymentConfirmationException {

		PharmaPaymentConfirmation pharmaPaymentConfirmation =
			fetchBygetPaymentConfirmationBy_CI(caseId);

		if (pharmaPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaPaymentConfirmationException(sb.toString());
		}

		return pharmaPaymentConfirmation;
	}

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPaymentConfirmationBy_CI, finderArgs,this);
		}

		if (result instanceof PharmaPaymentConfirmation) {
			PharmaPaymentConfirmation pharmaPaymentConfirmation =
				(PharmaPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, pharmaPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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

				List<PharmaPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPaymentConfirmationBy_CI,
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
								"PharmaPaymentConfirmationPersistenceImpl.fetchBygetPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaPaymentConfirmation pharmaPaymentConfirmation =
						list.get(0);

					result = pharmaPaymentConfirmation;

					cacheResult(pharmaPaymentConfirmation);
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
			return (PharmaPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the pharma payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma payment confirmation that was removed
	 */
	@Override
	public PharmaPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchPharmaPaymentConfirmationException {

		PharmaPaymentConfirmation pharmaPaymentConfirmation =
			findBygetPaymentConfirmationBy_CI(caseId);

		return remove(pharmaPaymentConfirmation);
	}

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"pharmaPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(pharmaPaymentConfirmation.caseId IS NULL OR pharmaPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmation_By_CI;

	/**
	 * Returns all the pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of matching pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end) {

		return findBygetPaymentConfirmation_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<PharmaPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<PharmaPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaPaymentConfirmation pharmaPaymentConfirmation :
						list) {

					if (!caseId.equals(pharmaPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_PHARMAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation findBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException {

		PharmaPaymentConfirmation pharmaPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_First(
				caseId, orderByComparator);

		if (pharmaPaymentConfirmation != null) {
			return pharmaPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_First(
		String caseId,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		List<PharmaPaymentConfirmation> list =
			findBygetPaymentConfirmation_By_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException {

		PharmaPaymentConfirmation pharmaPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_Last(caseId, orderByComparator);

		if (pharmaPaymentConfirmation != null) {
			return pharmaPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	@Override
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_Last(
		String caseId,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		int count = countBygetPaymentConfirmation_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<PharmaPaymentConfirmation> list =
			findBygetPaymentConfirmation_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma payment confirmations before and after the current pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaPaymentId the primary key of the current pharma payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long pharmaPaymentId, String caseId,
				OrderByComparator<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		PharmaPaymentConfirmation pharmaPaymentConfirmation = findByPrimaryKey(
			pharmaPaymentId);

		Session session = null;

		try {
			session = openSession();

			PharmaPaymentConfirmation[] array =
				new PharmaPaymentConfirmationImpl[3];

			array[0] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, pharmaPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = pharmaPaymentConfirmation;

			array[2] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, pharmaPaymentConfirmation, caseId, orderByComparator,
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

	protected PharmaPaymentConfirmation
		getBygetPaymentConfirmation_By_CI_PrevAndNext(
			Session session,
			PharmaPaymentConfirmation pharmaPaymentConfirmation, String caseId,
			OrderByComparator<PharmaPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
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
			sb.append(PharmaPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						pharmaPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPaymentConfirmation_By_CI(String caseId) {
		for (PharmaPaymentConfirmation pharmaPaymentConfirmation :
				findBygetPaymentConfirmation_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmation_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmation_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2 =
			"pharmaPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3 =
			"(pharmaPaymentConfirmation.caseId IS NULL OR pharmaPaymentConfirmation.caseId = '')";

	public PharmaPaymentConfirmationPersistenceImpl() {
		setModelClass(PharmaPaymentConfirmation.class);

		setModelImplClass(PharmaPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the pharma payment confirmation in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 */
	@Override
	public void cacheResult(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		entityCache.putResult(
			PharmaPaymentConfirmationImpl.class,
			pharmaPaymentConfirmation.getPrimaryKey(),
			pharmaPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI,
			new Object[] {pharmaPaymentConfirmation.getCaseId()},
			pharmaPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma payment confirmations in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmations the pharma payment confirmations
	 */
	@Override
	public void cacheResult(
		List<PharmaPaymentConfirmation> pharmaPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaPaymentConfirmation pharmaPaymentConfirmation :
				pharmaPaymentConfirmations) {

			if (entityCache.getResult(
					PharmaPaymentConfirmationImpl.class,
					pharmaPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(pharmaPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all pharma payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaPaymentConfirmationImpl.class);

		finderCache.clearCache(PharmaPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the pharma payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		entityCache.removeResult(
			PharmaPaymentConfirmationImpl.class, pharmaPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<PharmaPaymentConfirmation> pharmaPaymentConfirmations) {

		for (PharmaPaymentConfirmation pharmaPaymentConfirmation :
				pharmaPaymentConfirmations) {

			entityCache.removeResult(
				PharmaPaymentConfirmationImpl.class, pharmaPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaPaymentConfirmationModelImpl pharmaPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			pharmaPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI, args,
			pharmaPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new pharma payment confirmation with the primary key. Does not add the pharma payment confirmation to the database.
	 *
	 * @param pharmaPaymentId the primary key for the new pharma payment confirmation
	 * @return the new pharma payment confirmation
	 */
	@Override
	public PharmaPaymentConfirmation create(long pharmaPaymentId) {
		PharmaPaymentConfirmation pharmaPaymentConfirmation =
			new PharmaPaymentConfirmationImpl();

		pharmaPaymentConfirmation.setNew(true);
		pharmaPaymentConfirmation.setPrimaryKey(pharmaPaymentId);

		pharmaPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pharmaPaymentConfirmation;
	}

	/**
	 * Removes the pharma payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation remove(long pharmaPaymentId)
		throws NoSuchPharmaPaymentConfirmationException {

		return remove((Serializable)pharmaPaymentId);
	}

	/**
	 * Removes the pharma payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchPharmaPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			PharmaPaymentConfirmation pharmaPaymentConfirmation =
				(PharmaPaymentConfirmation)session.get(
					PharmaPaymentConfirmationImpl.class, primaryKey);

			if (pharmaPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaPaymentConfirmation);
		}
		catch (NoSuchPharmaPaymentConfirmationException noSuchEntityException) {
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
	protected PharmaPaymentConfirmation removeImpl(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaPaymentConfirmation)) {
				pharmaPaymentConfirmation =
					(PharmaPaymentConfirmation)session.get(
						PharmaPaymentConfirmationImpl.class,
						pharmaPaymentConfirmation.getPrimaryKeyObj());
			}

			if (pharmaPaymentConfirmation != null) {
				session.delete(pharmaPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaPaymentConfirmation != null) {
			clearCache(pharmaPaymentConfirmation);
		}

		return pharmaPaymentConfirmation;
	}

	@Override
	public PharmaPaymentConfirmation updateImpl(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		boolean isNew = pharmaPaymentConfirmation.isNew();

		if (!(pharmaPaymentConfirmation instanceof
				PharmaPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaPaymentConfirmation implementation " +
					pharmaPaymentConfirmation.getClass());
		}

		PharmaPaymentConfirmationModelImpl pharmaPaymentConfirmationModelImpl =
			(PharmaPaymentConfirmationModelImpl)pharmaPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaPaymentConfirmation.setCreateDate(date);
			}
			else {
				pharmaPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaPaymentConfirmation.setModifiedDate(date);
			}
			else {
				pharmaPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaPaymentConfirmation);
			}
			else {
				pharmaPaymentConfirmation =
					(PharmaPaymentConfirmation)session.merge(
						pharmaPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaPaymentConfirmationImpl.class,
			pharmaPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(pharmaPaymentConfirmationModelImpl);

		if (isNew) {
			pharmaPaymentConfirmation.setNew(false);
		}

		pharmaPaymentConfirmation.resetOriginalValues();

		return pharmaPaymentConfirmation;
	}

	/**
	 * Returns the pharma payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaPaymentConfirmationException {

		PharmaPaymentConfirmation pharmaPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (pharmaPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaPaymentConfirmation;
	}

	/**
	 * Returns the pharma payment confirmation with the primary key or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation findByPrimaryKey(long pharmaPaymentId)
		throws NoSuchPharmaPaymentConfirmationException {

		return findByPrimaryKey((Serializable)pharmaPaymentId);
	}

	/**
	 * Returns the pharma payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation, or <code>null</code> if a pharma payment confirmation with the primary key could not be found
	 */
	@Override
	public PharmaPaymentConfirmation fetchByPrimaryKey(long pharmaPaymentId) {
		return fetchByPrimaryKey((Serializable)pharmaPaymentId);
	}

	/**
	 * Returns all the pharma payment confirmations.
	 *
	 * @return the pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma payment confirmations
	 */
	@Override
	public List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<PharmaPaymentConfirmation> orderByComparator,
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

		List<PharmaPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<PharmaPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAPAYMENTCONFIRMATION;

				sql = sql.concat(
					PharmaPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the pharma payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaPaymentConfirmation pharmaPaymentConfirmation : findAll()) {
			remove(pharmaPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of pharma payment confirmations.
	 *
	 * @return the number of pharma payment confirmations
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
					_SQL_COUNT_PHARMAPAYMENTCONFIRMATION);

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
		return "pharmaPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma payment confirmation persistence.
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

		_finderPathFetchBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetPaymentConfirmation_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmation_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_setPharmaPaymentConfirmationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPharmaPaymentConfirmationUtilPersistence(null);

		entityCache.removeCache(PharmaPaymentConfirmationImpl.class.getName());
	}

	private void _setPharmaPaymentConfirmationUtilPersistence(
		PharmaPaymentConfirmationPersistence
			pharmaPaymentConfirmationPersistence) {

		try {
			Field field = PharmaPaymentConfirmationUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pharmaPaymentConfirmationPersistence);
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

	private static final String _SQL_SELECT_PHARMAPAYMENTCONFIRMATION =
		"SELECT pharmaPaymentConfirmation FROM PharmaPaymentConfirmation pharmaPaymentConfirmation";

	private static final String _SQL_SELECT_PHARMAPAYMENTCONFIRMATION_WHERE =
		"SELECT pharmaPaymentConfirmation FROM PharmaPaymentConfirmation pharmaPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_PHARMAPAYMENTCONFIRMATION =
		"SELECT COUNT(pharmaPaymentConfirmation) FROM PharmaPaymentConfirmation pharmaPaymentConfirmation";

	private static final String _SQL_COUNT_PHARMAPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(pharmaPaymentConfirmation) FROM PharmaPaymentConfirmation pharmaPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaPaymentConfirmationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PharmaPaymentConfirmationModelArgumentsResolver
		_pharmaPaymentConfirmationModelArgumentsResolver;

}