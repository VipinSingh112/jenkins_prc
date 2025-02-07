/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence.impl;

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

import com.nbp.osi.stages.services.exception.NoSuchOsiDeskVerificationException;
import com.nbp.osi.stages.services.model.OsiDeskVerification;
import com.nbp.osi.stages.services.model.OsiDeskVerificationTable;
import com.nbp.osi.stages.services.model.impl.OsiDeskVerificationImpl;
import com.nbp.osi.stages.services.model.impl.OsiDeskVerificationModelImpl;
import com.nbp.osi.stages.services.service.persistence.OsiDeskVerificationPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiDeskVerificationUtil;
import com.nbp.osi.stages.services.service.persistence.impl.constants.OSI_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the osi desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiDeskVerificationPersistence.class)
public class OsiDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<OsiDeskVerification>
	implements OsiDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiDeskVerificationUtil</code> to access the osi desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationOsiById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationOsiById;
	private FinderPath _finderPathCountBygetDeskVerificationOsiById;

	/**
	 * Returns all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId) {

		return findBygetDeskVerificationOsiById(
			osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of matching osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end) {

		return findBygetDeskVerificationOsiById(
			osiApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return findBygetDeskVerificationOsiById(
			osiApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationOsiById;
				finderArgs = new Object[] {osiApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationOsiById;
			finderArgs = new Object[] {
				osiApplicationId, start, end, orderByComparator
			};
		}

		List<OsiDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<OsiDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiDeskVerification osiDeskVerification : list) {
					if (osiApplicationId !=
							osiDeskVerification.getOsiApplicationId()) {

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

			sb.append(_SQL_SELECT_OSIDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONOSIBYID_OSIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				list = (List<OsiDeskVerification>)QueryUtil.list(
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
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	@Override
	public OsiDeskVerification findBygetDeskVerificationOsiById_First(
			long osiApplicationId,
			OrderByComparator<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException {

		OsiDeskVerification osiDeskVerification =
			fetchBygetDeskVerificationOsiById_First(
				osiApplicationId, orderByComparator);

		if (osiDeskVerification != null) {
			return osiDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	@Override
	public OsiDeskVerification fetchBygetDeskVerificationOsiById_First(
		long osiApplicationId,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		List<OsiDeskVerification> list = findBygetDeskVerificationOsiById(
			osiApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	@Override
	public OsiDeskVerification findBygetDeskVerificationOsiById_Last(
			long osiApplicationId,
			OrderByComparator<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException {

		OsiDeskVerification osiDeskVerification =
			fetchBygetDeskVerificationOsiById_Last(
				osiApplicationId, orderByComparator);

		if (osiDeskVerification != null) {
			return osiDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	@Override
	public OsiDeskVerification fetchBygetDeskVerificationOsiById_Last(
		long osiApplicationId,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationOsiById(osiApplicationId);

		if (count == 0) {
			return null;
		}

		List<OsiDeskVerification> list = findBygetDeskVerificationOsiById(
			osiApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi desk verifications before and after the current osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiDeskVerificationId the primary key of the current osi desk verification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification[] findBygetDeskVerificationOsiById_PrevAndNext(
			long osiDeskVerificationId, long osiApplicationId,
			OrderByComparator<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException {

		OsiDeskVerification osiDeskVerification = findByPrimaryKey(
			osiDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			OsiDeskVerification[] array = new OsiDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationOsiById_PrevAndNext(
				session, osiDeskVerification, osiApplicationId,
				orderByComparator, true);

			array[1] = osiDeskVerification;

			array[2] = getBygetDeskVerificationOsiById_PrevAndNext(
				session, osiDeskVerification, osiApplicationId,
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

	protected OsiDeskVerification getBygetDeskVerificationOsiById_PrevAndNext(
		Session session, OsiDeskVerification osiDeskVerification,
		long osiApplicationId,
		OrderByComparator<OsiDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_OSIDESKVERIFICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETDESKVERIFICATIONOSIBYID_OSIAPPLICATIONID_2);

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
			sb.append(OsiDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi desk verifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	@Override
	public void removeBygetDeskVerificationOsiById(long osiApplicationId) {
		for (OsiDeskVerification osiDeskVerification :
				findBygetDeskVerificationOsiById(
					osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiDeskVerification);
		}
	}

	/**
	 * Returns the number of osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi desk verifications
	 */
	@Override
	public int countBygetDeskVerificationOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerificationOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONOSIBYID_OSIAPPLICATIONID_2 =
			"osiDeskVerification.osiApplicationId = ?";

	public OsiDeskVerificationPersistenceImpl() {
		setModelClass(OsiDeskVerification.class);

		setModelImplClass(OsiDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the osi desk verification in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerification the osi desk verification
	 */
	@Override
	public void cacheResult(OsiDeskVerification osiDeskVerification) {
		entityCache.putResult(
			OsiDeskVerificationImpl.class, osiDeskVerification.getPrimaryKey(),
			osiDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi desk verifications in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerifications the osi desk verifications
	 */
	@Override
	public void cacheResult(List<OsiDeskVerification> osiDeskVerifications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiDeskVerification osiDeskVerification : osiDeskVerifications) {
			if (entityCache.getResult(
					OsiDeskVerificationImpl.class,
					osiDeskVerification.getPrimaryKey()) == null) {

				cacheResult(osiDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all osi desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiDeskVerificationImpl.class);

		finderCache.clearCache(OsiDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the osi desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiDeskVerification osiDeskVerification) {
		entityCache.removeResult(
			OsiDeskVerificationImpl.class, osiDeskVerification);
	}

	@Override
	public void clearCache(List<OsiDeskVerification> osiDeskVerifications) {
		for (OsiDeskVerification osiDeskVerification : osiDeskVerifications) {
			entityCache.removeResult(
				OsiDeskVerificationImpl.class, osiDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OsiDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new osi desk verification with the primary key. Does not add the osi desk verification to the database.
	 *
	 * @param osiDeskVerificationId the primary key for the new osi desk verification
	 * @return the new osi desk verification
	 */
	@Override
	public OsiDeskVerification create(long osiDeskVerificationId) {
		OsiDeskVerification osiDeskVerification = new OsiDeskVerificationImpl();

		osiDeskVerification.setNew(true);
		osiDeskVerification.setPrimaryKey(osiDeskVerificationId);

		osiDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiDeskVerification;
	}

	/**
	 * Removes the osi desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification that was removed
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification remove(long osiDeskVerificationId)
		throws NoSuchOsiDeskVerificationException {

		return remove((Serializable)osiDeskVerificationId);
	}

	/**
	 * Removes the osi desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi desk verification
	 * @return the osi desk verification that was removed
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification remove(Serializable primaryKey)
		throws NoSuchOsiDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			OsiDeskVerification osiDeskVerification =
				(OsiDeskVerification)session.get(
					OsiDeskVerificationImpl.class, primaryKey);

			if (osiDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiDeskVerification);
		}
		catch (NoSuchOsiDeskVerificationException noSuchEntityException) {
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
	protected OsiDeskVerification removeImpl(
		OsiDeskVerification osiDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiDeskVerification)) {
				osiDeskVerification = (OsiDeskVerification)session.get(
					OsiDeskVerificationImpl.class,
					osiDeskVerification.getPrimaryKeyObj());
			}

			if (osiDeskVerification != null) {
				session.delete(osiDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiDeskVerification != null) {
			clearCache(osiDeskVerification);
		}

		return osiDeskVerification;
	}

	@Override
	public OsiDeskVerification updateImpl(
		OsiDeskVerification osiDeskVerification) {

		boolean isNew = osiDeskVerification.isNew();

		if (!(osiDeskVerification instanceof OsiDeskVerificationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiDeskVerification implementation " +
					osiDeskVerification.getClass());
		}

		OsiDeskVerificationModelImpl osiDeskVerificationModelImpl =
			(OsiDeskVerificationModelImpl)osiDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiDeskVerification.setCreateDate(date);
			}
			else {
				osiDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiDeskVerification.setModifiedDate(date);
			}
			else {
				osiDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiDeskVerification);
			}
			else {
				osiDeskVerification = (OsiDeskVerification)session.merge(
					osiDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiDeskVerificationImpl.class, osiDeskVerificationModelImpl, false,
			true);

		if (isNew) {
			osiDeskVerification.setNew(false);
		}

		osiDeskVerification.resetOriginalValues();

		return osiDeskVerification;
	}

	/**
	 * Returns the osi desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi desk verification
	 * @return the osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiDeskVerificationException {

		OsiDeskVerification osiDeskVerification = fetchByPrimaryKey(primaryKey);

		if (osiDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiDeskVerification;
	}

	/**
	 * Returns the osi desk verification with the primary key or throws a <code>NoSuchOsiDeskVerificationException</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification findByPrimaryKey(long osiDeskVerificationId)
		throws NoSuchOsiDeskVerificationException {

		return findByPrimaryKey((Serializable)osiDeskVerificationId);
	}

	/**
	 * Returns the osi desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification, or <code>null</code> if a osi desk verification with the primary key could not be found
	 */
	@Override
	public OsiDeskVerification fetchByPrimaryKey(long osiDeskVerificationId) {
		return fetchByPrimaryKey((Serializable)osiDeskVerificationId);
	}

	/**
	 * Returns all the osi desk verifications.
	 *
	 * @return the osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi desk verifications
	 */
	@Override
	public List<OsiDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiDeskVerification> orderByComparator,
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

		List<OsiDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<OsiDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIDESKVERIFICATION;

				sql = sql.concat(OsiDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiDeskVerification>)QueryUtil.list(
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
	 * Removes all the osi desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiDeskVerification osiDeskVerification : findAll()) {
			remove(osiDeskVerification);
		}
	}

	/**
	 * Returns the number of osi desk verifications.
	 *
	 * @return the number of osi desk verifications
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
					_SQL_COUNT_OSIDESKVERIFICATION);

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
		return "osiDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationOsiById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationOsiById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"osiApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationOsiById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationOsiById",
				new String[] {Long.class.getName()},
				new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetDeskVerificationOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		OsiDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(OsiDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIDESKVERIFICATION =
		"SELECT osiDeskVerification FROM OsiDeskVerification osiDeskVerification";

	private static final String _SQL_SELECT_OSIDESKVERIFICATION_WHERE =
		"SELECT osiDeskVerification FROM OsiDeskVerification osiDeskVerification WHERE ";

	private static final String _SQL_COUNT_OSIDESKVERIFICATION =
		"SELECT COUNT(osiDeskVerification) FROM OsiDeskVerification osiDeskVerification";

	private static final String _SQL_COUNT_OSIDESKVERIFICATION_WHERE =
		"SELECT COUNT(osiDeskVerification) FROM OsiDeskVerification osiDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}