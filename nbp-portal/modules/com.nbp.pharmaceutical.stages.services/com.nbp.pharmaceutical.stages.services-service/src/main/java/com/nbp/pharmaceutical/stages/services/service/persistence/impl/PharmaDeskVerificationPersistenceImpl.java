/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaDeskVerificationException;
import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;
import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerificationTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaDeskVerificationPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaDeskVerificationUtil;
import com.nbp.pharmaceutical.stages.services.service.persistence.impl.constants.PHARMA_STAGESPersistenceConstants;

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
 * The persistence implementation for the pharma desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaDeskVerificationPersistence.class)
public class PharmaDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<PharmaDeskVerification>
	implements PharmaDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaDeskVerificationUtil</code> to access the pharma desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationPharmaById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById;
	private FinderPath _finderPathCountBygetDeskVerificationPharmaById;

	/**
	 * Returns all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findBygetDeskVerificationPharmaById(
		long pharmaApplicationId) {

		return findBygetDeskVerificationPharmaById(
			pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of matching pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findBygetDeskVerificationPharmaById(
		long pharmaApplicationId, int start, int end) {

		return findBygetDeskVerificationPharmaById(
			pharmaApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findBygetDeskVerificationPharmaById(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return findBygetDeskVerificationPharmaById(
			pharmaApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findBygetDeskVerificationPharmaById(
		long pharmaApplicationId, int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById;
				finderArgs = new Object[] {pharmaApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationPharmaById;
			finderArgs = new Object[] {
				pharmaApplicationId, start, end, orderByComparator
			};
		}

		List<PharmaDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<PharmaDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaDeskVerification pharmaDeskVerification : list) {
					if (pharmaApplicationId !=
							pharmaDeskVerification.getPharmaApplicationId()) {

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

			sb.append(_SQL_SELECT_PHARMADESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_PHARMAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				list = (List<PharmaDeskVerification>)QueryUtil.list(
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
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	@Override
	public PharmaDeskVerification findBygetDeskVerificationPharmaById_First(
			long pharmaApplicationId,
			OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException {

		PharmaDeskVerification pharmaDeskVerification =
			fetchBygetDeskVerificationPharmaById_First(
				pharmaApplicationId, orderByComparator);

		if (pharmaDeskVerification != null) {
			return pharmaDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	@Override
	public PharmaDeskVerification fetchBygetDeskVerificationPharmaById_First(
		long pharmaApplicationId,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		List<PharmaDeskVerification> list = findBygetDeskVerificationPharmaById(
			pharmaApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	@Override
	public PharmaDeskVerification findBygetDeskVerificationPharmaById_Last(
			long pharmaApplicationId,
			OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException {

		PharmaDeskVerification pharmaDeskVerification =
			fetchBygetDeskVerificationPharmaById_Last(
				pharmaApplicationId, orderByComparator);

		if (pharmaDeskVerification != null) {
			return pharmaDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaApplicationId=");
		sb.append(pharmaApplicationId);

		sb.append("}");

		throw new NoSuchPharmaDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	@Override
	public PharmaDeskVerification fetchBygetDeskVerificationPharmaById_Last(
		long pharmaApplicationId,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationPharmaById(pharmaApplicationId);

		if (count == 0) {
			return null;
		}

		List<PharmaDeskVerification> list = findBygetDeskVerificationPharmaById(
			pharmaApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma desk verifications before and after the current pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDeskVerificationId the primary key of the current pharma desk verification
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long pharmaDeskVerificationId, long pharmaApplicationId,
				OrderByComparator<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException {

		PharmaDeskVerification pharmaDeskVerification = findByPrimaryKey(
			pharmaDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			PharmaDeskVerification[] array = new PharmaDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationPharmaById_PrevAndNext(
				session, pharmaDeskVerification, pharmaApplicationId,
				orderByComparator, true);

			array[1] = pharmaDeskVerification;

			array[2] = getBygetDeskVerificationPharmaById_PrevAndNext(
				session, pharmaDeskVerification, pharmaApplicationId,
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

	protected PharmaDeskVerification
		getBygetDeskVerificationPharmaById_PrevAndNext(
			Session session, PharmaDeskVerification pharmaDeskVerification,
			long pharmaApplicationId,
			OrderByComparator<PharmaDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMADESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_PHARMAAPPLICATIONID_2);

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
			sb.append(PharmaDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(pharmaApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma desk verifications where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	@Override
	public void removeBygetDeskVerificationPharmaById(
		long pharmaApplicationId) {

		for (PharmaDeskVerification pharmaDeskVerification :
				findBygetDeskVerificationPharmaById(
					pharmaApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaDeskVerification);
		}
	}

	/**
	 * Returns the number of pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma desk verifications
	 */
	@Override
	public int countBygetDeskVerificationPharmaById(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerificationPharmaById;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMADESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_PHARMAAPPLICATIONID_2 =
			"pharmaDeskVerification.pharmaApplicationId = ?";

	public PharmaDeskVerificationPersistenceImpl() {
		setModelClass(PharmaDeskVerification.class);

		setModelImplClass(PharmaDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the pharma desk verification in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 */
	@Override
	public void cacheResult(PharmaDeskVerification pharmaDeskVerification) {
		entityCache.putResult(
			PharmaDeskVerificationImpl.class,
			pharmaDeskVerification.getPrimaryKey(), pharmaDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma desk verifications in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerifications the pharma desk verifications
	 */
	@Override
	public void cacheResult(
		List<PharmaDeskVerification> pharmaDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaDeskVerification pharmaDeskVerification :
				pharmaDeskVerifications) {

			if (entityCache.getResult(
					PharmaDeskVerificationImpl.class,
					pharmaDeskVerification.getPrimaryKey()) == null) {

				cacheResult(pharmaDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all pharma desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaDeskVerificationImpl.class);

		finderCache.clearCache(PharmaDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the pharma desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaDeskVerification pharmaDeskVerification) {
		entityCache.removeResult(
			PharmaDeskVerificationImpl.class, pharmaDeskVerification);
	}

	@Override
	public void clearCache(
		List<PharmaDeskVerification> pharmaDeskVerifications) {

		for (PharmaDeskVerification pharmaDeskVerification :
				pharmaDeskVerifications) {

			entityCache.removeResult(
				PharmaDeskVerificationImpl.class, pharmaDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new pharma desk verification with the primary key. Does not add the pharma desk verification to the database.
	 *
	 * @param pharmaDeskVerificationId the primary key for the new pharma desk verification
	 * @return the new pharma desk verification
	 */
	@Override
	public PharmaDeskVerification create(long pharmaDeskVerificationId) {
		PharmaDeskVerification pharmaDeskVerification =
			new PharmaDeskVerificationImpl();

		pharmaDeskVerification.setNew(true);
		pharmaDeskVerification.setPrimaryKey(pharmaDeskVerificationId);

		pharmaDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaDeskVerification;
	}

	/**
	 * Removes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification remove(long pharmaDeskVerificationId)
		throws NoSuchPharmaDeskVerificationException {

		return remove((Serializable)pharmaDeskVerificationId);
	}

	/**
	 * Removes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification remove(Serializable primaryKey)
		throws NoSuchPharmaDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			PharmaDeskVerification pharmaDeskVerification =
				(PharmaDeskVerification)session.get(
					PharmaDeskVerificationImpl.class, primaryKey);

			if (pharmaDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaDeskVerification);
		}
		catch (NoSuchPharmaDeskVerificationException noSuchEntityException) {
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
	protected PharmaDeskVerification removeImpl(
		PharmaDeskVerification pharmaDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaDeskVerification)) {
				pharmaDeskVerification = (PharmaDeskVerification)session.get(
					PharmaDeskVerificationImpl.class,
					pharmaDeskVerification.getPrimaryKeyObj());
			}

			if (pharmaDeskVerification != null) {
				session.delete(pharmaDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaDeskVerification != null) {
			clearCache(pharmaDeskVerification);
		}

		return pharmaDeskVerification;
	}

	@Override
	public PharmaDeskVerification updateImpl(
		PharmaDeskVerification pharmaDeskVerification) {

		boolean isNew = pharmaDeskVerification.isNew();

		if (!(pharmaDeskVerification instanceof
				PharmaDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaDeskVerification implementation " +
					pharmaDeskVerification.getClass());
		}

		PharmaDeskVerificationModelImpl pharmaDeskVerificationModelImpl =
			(PharmaDeskVerificationModelImpl)pharmaDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaDeskVerification.setCreateDate(date);
			}
			else {
				pharmaDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaDeskVerification.setModifiedDate(date);
			}
			else {
				pharmaDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaDeskVerification);
			}
			else {
				pharmaDeskVerification = (PharmaDeskVerification)session.merge(
					pharmaDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaDeskVerificationImpl.class, pharmaDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			pharmaDeskVerification.setNew(false);
		}

		pharmaDeskVerification.resetOriginalValues();

		return pharmaDeskVerification;
	}

	/**
	 * Returns the pharma desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaDeskVerificationException {

		PharmaDeskVerification pharmaDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (pharmaDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaDeskVerification;
	}

	/**
	 * Returns the pharma desk verification with the primary key or throws a <code>NoSuchPharmaDeskVerificationException</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification findByPrimaryKey(
			long pharmaDeskVerificationId)
		throws NoSuchPharmaDeskVerificationException {

		return findByPrimaryKey((Serializable)pharmaDeskVerificationId);
	}

	/**
	 * Returns the pharma desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification, or <code>null</code> if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification fetchByPrimaryKey(
		long pharmaDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)pharmaDeskVerificationId);
	}

	/**
	 * Returns all the pharma desk verifications.
	 *
	 * @return the pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findAll(
		int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> findAll(
		int start, int end,
		OrderByComparator<PharmaDeskVerification> orderByComparator,
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

		List<PharmaDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<PharmaDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMADESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMADESKVERIFICATION;

				sql = sql.concat(PharmaDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaDeskVerification>)QueryUtil.list(
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
	 * Removes all the pharma desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaDeskVerification pharmaDeskVerification : findAll()) {
			remove(pharmaDeskVerification);
		}
	}

	/**
	 * Returns the number of pharma desk verifications.
	 *
	 * @return the number of pharma desk verifications
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
					_SQL_COUNT_PHARMADESKVERIFICATION);

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
		return "pharmaDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMADESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationPharmaById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationPharmaById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"pharmaApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationPharmaById",
				new String[] {Long.class.getName()},
				new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetDeskVerificationPharmaById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationPharmaById",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(PharmaDeskVerificationImpl.class.getName());
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

	private static final String _SQL_SELECT_PHARMADESKVERIFICATION =
		"SELECT pharmaDeskVerification FROM PharmaDeskVerification pharmaDeskVerification";

	private static final String _SQL_SELECT_PHARMADESKVERIFICATION_WHERE =
		"SELECT pharmaDeskVerification FROM PharmaDeskVerification pharmaDeskVerification WHERE ";

	private static final String _SQL_COUNT_PHARMADESKVERIFICATION =
		"SELECT COUNT(pharmaDeskVerification) FROM PharmaDeskVerification pharmaDeskVerification";

	private static final String _SQL_COUNT_PHARMADESKVERIFICATION_WHERE =
		"SELECT COUNT(pharmaDeskVerification) FROM PharmaDeskVerification pharmaDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}